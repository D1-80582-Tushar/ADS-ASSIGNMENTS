
public class Mainq2 {

	public static <T> int linearSearch(T[] arr,T val) {
		for (int i= arr.length-1;i>0;i--) {
			 if(arr[i].equals(val)) {
				 return i;
			 }
		}
		return -1; 
	}
	public static void main(String[] args) {
//		2. Write a linear search algorithm to return index of last occurance of key.
		Integer[] arr1 = {1,2,3,4,1,3,4};
		
		int ans = linearSearch(arr1,1);
		System.out.println(ans);
	}

}
