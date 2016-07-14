import java.util.Scanner;

public class OneEdit {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String str1 = in.nextLine();
		String str2 = in.nextLine();
		in.close();
		
		compare(str1, str2);
	}

	private static boolean compare(String str1, String str2) {
		int len1 = str1.length();
		int len2 = str2.length();
		
		if(len1 == len2){
			return replace1(str1, str2);
		}
		else if(len1 + 1 == len2){
			return insert1(str1, str2);
		}
		else if(len1 - 1 == len2){
			return insert1(str2, str1);
		}
		return false;
	}

	private static boolean insert1(String str1, String str2) {
		
		int i = 0;
		int j = 0;
		
		while(i < str1.length() && j < str2.length()){
			if(str1.charAt(i) == str2.charAt(j)){
				i++;
				j++;
			}
			else{
				if(i != j ){
					System.out.println("false");
					return false;
				}
				j++;
			}
		}
		System.out.println("true");
		return true;
	}

	private static boolean replace1(String str1, String str2) {
		boolean foundDifference = false;
		int len1 = str1.length();
		for(int i = 0; i < len1; i++){
			if(str1.charAt(i)!=str2.charAt(i)){
				if(foundDifference){	
					return false;
				}
				foundDifference = true;
			}
		}
		System.out.println(foundDifference);
		return true;
	}	

}
