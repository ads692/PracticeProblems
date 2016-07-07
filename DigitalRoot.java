import java.util.Scanner;

public class DigitalRoot {
	public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		int p = calc(num);
		if(p % 10 != 0){
			calc(p);
		}
		System.out.println(calc(p));
		
		in.close();
	}

	private static int calc(int num) {
		int x = 0;
		while(num!=0){
			x += num%10;
			num = num/10;
		}
		return x;
	}

}
