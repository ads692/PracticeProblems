import java.util.Scanner;

public class AnagramChecker {

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		int cases = in.nextInt();
        for(int i = 0; i < cases; i++){
            Check4Anagram(in.next());
        }
        in.close();
	}

	private static void Check4Anagram(String str) {
		
		if (str.length()%2!=0){
            System.out.println(-1);
        }else{
        	String str1 = str.substring(0, str.length()/2);
    		String str2 = str.substring(str.length()/2, str.length());
    		
    		System.out.println(str1+" "+str2);
    		
    		int count = 0;
    		char[] c = str1.toCharArray();
    		
    		for (char cc : c){
                int index = str2.indexOf(cc);
                if (index == -1){
                    count++;
                } else {
                    str2 = str2.substring(0,index)+str2.substring(index+1);
                }
            }
    		System.out.println(count);
        }
		
	}
	
}
