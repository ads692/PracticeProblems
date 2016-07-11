import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AddingNandD {
	
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int d = in.nextInt();
		
		in.close();
		
		addNnD(n,d);
	}

	private static void addNnD(int n, int d) {
		
		int nums = 0;
		ArrayList<Integer> myList = new ArrayList<Integer>();
		
		if(n==0){
			int x = n+d;
			System.out.println("["+x+"]");
		}
		
		else{
			while(n>0){
				
				nums = n%10;
				n = n/10;
				
				myList.add(nums+d);
			}
		
			Collections.reverse(myList);
			System.out.println(myList);
		}	
	}
}
