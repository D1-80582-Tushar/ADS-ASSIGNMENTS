
public class Mainq9 {

	public static void selectionSort(int[] arr) {
	     for(int round=0;round<arr.length;round++) {
	          int smallest_element =  arr[round];
	          
	          for(int j=round+1; j<arr.length ;j++) {
	        	   if(smallest_element > arr[j]) {
	        		     int temp = smallest_element;
	        		     smallest_element = arr[j];
	        		     arr[j] = temp;
	        	   }
	          }
	          arr[round] = smallest_element;
	      }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a selection sort function to sort array and returns no of comparisions.
        int[] arr = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };	
     
        selectionSort(arr);
        for (Integer integer : arr) {
			System.out.print(integer+" ");
		}
        
	}

}
