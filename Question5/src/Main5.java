public class Main5 {
    
	public static <T extends Number> int binarySearch(T[] arr,T element) {
         int s = 0;
         int e = arr.length-1;
         
         while(e>=s) {
        	 int mid = (s+e)/2;
        	 if(arr[mid].equals(element)) {
        		 return mid;
        	 }else if(element.intValue() > arr[mid].intValue()) {
        	      e = mid-1;	 
        	 }else {
        		 s = mid+1;
        	 }
         }
         return -1;
         
    }
    
	public static void main(String[] args) {
//		5. Implement binary search algorithm if array is sorted in descending order.
	    Integer[] arr = {9,8,7,6,5,4,3,2,1};
	    int ans = binarySearch(arr,1);
	    System.out.println(ans);
    }
}
