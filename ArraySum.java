import java.util.Hashtable;
import java.util.Scanner;

public class ArraySum {
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int[] a = new int[5];
		for(int i = 0; i < a.length; i++){
			a[i] = in.nextInt();
		}
		int check = 80;
		in.close();
		
		checkSum(a, check);
		//System.out.println(Arrays.toString(a));
	}

	private static void checkSum(int[] a, int check) {
		
		Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
		
		for(int i = 0; i < a.length; i++){
			
			int val = check - a[i];
			if(ht.containsKey(val)){
				System.out.println(a[i] + " " + val);
			}
			ht.put(a[i], i);
		}
	}
}
