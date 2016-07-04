import java.util.Scanner;

public class LongestSubsequenceWithNoRepeatingChars {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		String str = in.nextLine();
		naive(str);
		optimized(str);
		
	}
	
	private static void naive(String str) {
		int maxcount = 0;
		for(int i=0; i< str.length(); i++ )
		{
			int count = 0;
			boolean[] arr = new boolean[256];

			for(int j=i ; j<str.length(); j++)
			{
				char c = str.charAt(j);
				if(arr[c])
				{
					break;
				}
				else
				{
					arr[c] = true;
					count ++;
					if(count > maxcount)
					{
						maxcount = count;
					}
				}
			}
		}
		
	}

	private static void optimized(String str)
	{
		int[] arr_count = new int[str.length()]; 
		int[] arr_pos = new int[256];
		for(int i=0; i<arr_pos.length; i++)
		{
			arr_pos[i] = -1;
		}
		
		for(int i=0; i<arr_count.length; i++)
		{
			arr_count[i] = 0;
		}
		
		arr_count[0] = 1;
		arr_pos[str.charAt(0)] = 0;
		int maxCount = 0;
		for(int i=1; i<str.length(); i++)
		{
			char c = str.charAt(i);
			int prevCount = arr_count[i-1];
			if(arr_pos[c] != -1)
			{
				arr_count[i] = i -  arr_pos[c];
				if(arr_count[i] > prevCount + 1)
					arr_count[i] = prevCount + 1;
			}
			else
			{
				arr_count[i] = prevCount + 1;
			}
			arr_pos[c] = i;
			if(arr_count[i] > maxCount)
				maxCount = arr_count[i];
		}
		System.out.println("Optimized "+maxCount);
	}


}
