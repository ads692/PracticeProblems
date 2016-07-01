import java.util.ArrayList;
import java.util.Scanner;

public class hugeStringtoNumber {
public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		in.close();
		
		System.out.println(findDouble(str));
		
		//System.out.println(str);
		/*
		double d = Double.parseDouble(str);
		System.out.println("d "+ d);

		Double D = Double.valueOf(str);
		System.out.println("D "+ D);
		*/
		
}

private static double findDouble(String str) {
	
	double d = 0;
	ArrayList<Integer> a = new ArrayList<Integer>();
	try{
		for(int i=0; i<str.length();i++){
			char c = str.charAt(i);
			a.add((int) c-'0'); 
		}
		
		System.out.println(a);
		
		for(int j = 0; j < a.size() ; j++){
			d = d*10;
			d += a.get(j);
		}
	}
	
	catch(Exception e){
		e.printStackTrace();
	}
	
	return d;
}		

}
