
public class Mainq3 {

		 
	public static <T> int linearSearch(T[] arr,T element) {
		int count = 0;	
		for (int i=0; i<arr.length-1;i++) {
				 if(arr[i].equals(element)) {
					 break;
				 }else {
					 count++;
				 }
			}
			return count; 
	}
	
	public static <T extends Number> int binarySearch(T[] arr,T element) {
		int start = 0;
		int end = arr.length-1;
		int count = 0;
		while(start<=end) {		    
			int mid = (start+end)/2;
			if(arr[mid].equals(element)) {
				break;		          	
		    }else if(arr[mid].intValue()  < element.intValue()) {
		    	count++;
		        start = mid+1;
		    }else {
		    	count++;
		    	end = mid-1;
		    }
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3. Write a program to print no of comparisions done to search a key in i. linear search ii. binary serach
	
         Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
         int ans = linearSearch(arr, 8);
         int ans2 = binarySearch(arr, 8);
       
         System.out.println("comparisions in linear search-->"+ans);
         System.out.println("comparisions in binary search-->"+ans2);
	}

}
