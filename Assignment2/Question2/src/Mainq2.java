
public class Mainq2 {

	public static void insertionSortDesc(int[] arr) {
	   	 for(int i=1;i<arr.length;i++) {
	   		 int temp = arr[i];
	   		 int j = i-1;
	   		 for(;j>=0;j--) {
	   			 if(arr[j] < temp) {
	   				  //shift
	   				 arr[j+1] = arr[j];
	   			 }else {
	   				 break;
	   			 }
	   		 }
	   		 arr[j+1]=temp;
	   	 }
	}
	
	public static void main(String[] args) {
       //2. Modify the insertion sort algorithm to sort the array in descending order
		
		 int[] arr =  {2,1,5,4,6,7,9,8,0,3};
		 System.out.println("Before sort");
		 for (int i : arr) {
			 System.out.print(i+" ");
		 }
		 System.out.println();
		 insertionSortDesc(arr);
		 
		 System.out.println("After sort");
		 for (int i : arr) {
			 System.out.print(i+" ");
		 }
	}

}
