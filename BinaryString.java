import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BinaryString {

	public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		
		in.close();
		
		beautify(str);
		
		beautify2(str);
	}

	private static void beautify2(String str) {
		
		String p = "010";
		int count = 0;
		
		for(int i = 0; i <= str.length()-3;){
			if(str.substring(i, i+3).equals(p)){
				count++;
				i=i+3;
			}
			else{
				i++;
			}
		}
		System.out.println(count);
	}

	private static void beautify(String str) {
		
		String p = "010";
		
		Pattern pattern = Pattern.compile(p);
		Matcher match = pattern.matcher(str); 
		
		int count = 0;
		while (match.find()){
			count++;
		}
		System.out.println(count);
		//String s = str.replaceAll(pattern, "");
	}
		
}
