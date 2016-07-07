import java.util.Scanner;

public class DeleteAdjacentChars {
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(in.nextLine());
		in.close();
		
		deleteChars(sb);
	}

	private static void deleteChars(StringBuilder str) {
				
		for(int i = 1; i<str.length(); i++){
			
			if(str.charAt(i) == str.charAt(i-1)){
				str.delete(i-1, i+1);
				i=0;
			}
		}
		
		if(str.length() == 0)
			System.out.println("Empty String");
		else
			System.out.println(str);
	}
}
