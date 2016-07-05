import java.util.Hashtable;
import java.util.Scanner;

public class ArrayDuplicates {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		int[] a = new int[5];
		
		for(int i = 0; i < a.length; i++){
			a[i] = in.nextInt();
		}
		in.close();
		
		findDuplicates(a);
		//System.out.println(Arrays.toString(a));
	}

	private static void findDuplicates(int[] a) {
		
	Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
		
		for(int i = 0; i < a.length; i++){
			
			if(ht.containsKey(a[i])){
				System.out.println("Duplicate "+ a[i] + " at position "+ i);
			}
			
			ht.put(a[i], i);
		}
	}
}
