import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class CountPalindromes {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
		in.close();
		countAllPalindrome(str);
    }
	
	public static boolean checkPalindrome(String str) {
        for(int i=0;i<=str.length()/2;i++)
            if(str.charAt(i)!=str.charAt(str.length()-1-i))
                return false;
        return true;
    }

    public static void countAllPalindrome(String str) {
        
    	HashSet<String> hs = new HashSet<String>();
    	//LinkedList<String> hs = new LinkedList<String>();
    	int count = 0;
    	for(int i=0;i<=str.length();i++)
            for(int j=i;j<str.length();j++)
                if(checkPalindrome(str.substring(i,j+1))){
                	hs.add(str.substring(i,j+1));
    				count++;
                }
        
    	System.out.println(count);
        System.out.println(hs);
    	System.out.println(hs.size());
    }
    

}
