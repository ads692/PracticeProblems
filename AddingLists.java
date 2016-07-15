import java.util.LinkedList;

public class AddingLists {
	
	public static void main(String args[]){
	
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list1.add(7);
		list1.add(1);
		list1.add(1);
		list1.add(2);
		list1.add(1);
		list1.add(7);
		
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		//list2.add(9);
		list2.add(9);
		list2.add(8);
		list2.add(8);
		add(list1, list2);
		
	}

	private static void add(LinkedList<Integer> list1, LinkedList<Integer> list2) {
		
		findSizeDifference(list1, list2);
		
		int sum = 0;
		int carry = 0;
		for(int i = list1.size()-1; i >= 0 ;i--){
			
			sum = carry + list1.get(i) + list2.get(i);
			
			if(i > 0 && sum > 9){
				carry = sum/10;
				sum = sum%10;
			}
			else if(sum <= 9){
				sum = sum + 0;
				carry = 0;
			}
			list1.remove(i);
			list1.add(i, sum);
		}
		System.out.println(list1);
	}

	private static void findSizeDifference(LinkedList<Integer> list1, LinkedList<Integer> list2) {
		
		int max = Math.max(list1.size(), list2.size());
		int min = Math.min(list1.size(), list2.size());
		
		int sizeDiff = max - min;
		
		while(sizeDiff != 0){
		
			if(list1.size() == min){
				list1.addFirst(0);
			}
			else{
				list2.addFirst(0);
			}
			sizeDiff--;
		}
		System.out.println(list1);
		System.out.println(list2);
		
	}	
}
