import java.util.LinkedHashSet;

public class Mainq7 {

	public static boolean findRepeatedOccurence(int[] list,int value) {
		int count=0;
		
		for (int i : list) {
			if(i == value) {
				count++;
			}
		}
		if(count > 1) {
			return false;			
		}else {
			return true;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // find the first non-repeating element: Input: { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 } Ouput: 3
		
		int[] list1 =  { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
//		Collection<Integer> list = new listayList<>();
		
		LinkedHashSet<Integer> list = new LinkedHashSet<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(-1);
		list.add(2);
		list.add(1);
		list.add(0);
		list.add(4);
		list.add(-1);
		list.add(7);
		list.add(8);
		
		int ans=-1;
		for (Integer integer : list) {
			if(findRepeatedOccurence(list1, integer)) {
			  ans=integer;	
			  break;
			}
		}
		System.out.println(ans);
		
	}

}
