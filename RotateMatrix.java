import java.util.Scanner;

public class RotateMatrix {

	public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int[][] a = new int[n][n];
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				a[i][j] = in.nextInt();
			}
		}
		
		System.out.print("\n");
		
		in.close();
		
		rotate(a);
	}

	private static void rotate(int[][] a) {
		
		int n = a.length;
		for (int layer = 0; layer < n / 2; layer++) {
			int first = layer;
			int last = n - layer -1;;
			for (int i = first; i < last; i++) {
				int offset = i - first;
				int top = a[first][i];
				a[first][i] = a[last - offset][first];
				a[last - offset][first] = a[last][last - offset];
				a[last - offset][last] = a[i][last];
				a[i][last] = top;
			}
		}
		
		for (int[] x : a) { 
			for (int i : x) {
				System.out.print(i + " ");
			}
			System.out.print("\n");
		}
	}
	
}
