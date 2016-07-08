import java.util.Scanner;

public class FindAnagramPairs {
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		String str1 = in.nextLine();
		String str2 = in.nextLine();
		
		in.close();
		
		System.out.println(findAnagram(str1, str2));
	}
	
	private static boolean findAnagram(String str1, String str2) {
		
		int len1 = str1.length();
		int len2 = str2.length();
		
		int[] countChars = new int[256];
		
		if(str1!=null && str2!=null){
			if(len1 != len2){
				return false;
			}
			for(int i = 0; i < len1; i++){
				countChars[str1.charAt(i)]++;
				countChars[str2.charAt(i)]--;
			}
			
			for(int i = 0; i < countChars.length; i++){
				if(countChars[i]!=0){
					return false;
				}
			}
			return true;
		}
		else{
			return (str1 == null && str2 == null);
		}
	}
}
