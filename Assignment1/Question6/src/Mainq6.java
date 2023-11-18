
public class Mainq6 {
	
	public static <T> int linearSearch(T[] arr,T val,int n) {
		int count = n;
		for (int i= 0;i<arr.length;i++) {
			 if(n==0) {
				 return i-1;
			 }
			 if(arr[i].equals(val)) {
				 n--;
			 }
		}
		return -1; 
	}
	
	public static void main(String[] args) {
//	   Implement linear search algorithm to find the nth occurence of the given element. If nth occurrence is
//	   not found, return -1.
		Integer[] arr = {12,12,1,12,4,1,6,4,3,2};
		
		//find 3 rd occurence of 12
        int ans = linearSearch(arr,4, 2);
        System.out.println(ans);
   }
}
