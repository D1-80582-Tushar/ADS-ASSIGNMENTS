
public class Mainq1 {
    
	public static void insertionSort(int[] arr) {
        //start from 2nd index
		// 2 1 5 4 6 7 9 8 0 3
		// round 1
		// select "1"
		// now check for left elements of 1 (loop over left --> j=i-1;j>=0;j-- ) 
        // 1st check 2 > 1 if left element is greater then save "1" to temp = arr[i] value and shift left element to right one position --> arr[i] = arr[j]
		// after loop is over take track of j outside loop ki kahan tak gya 
		// then put temp to that position
		
		// left ka ek set hoga jisme hame check karna hai agar koi badi values hyi toh shift karna hai jaha pai value choti  agyi wha rukna hai
		//outer loop
		for(int i=1;i<arr.length;i++) {
			 //inner loop
			int temp = arr[i];
			int j = i - 1;
			for (;j>=0; j--) {
				if(arr[j]> temp) {
					//shift
					arr[j+1]=arr[j];
				}else {
					break;
				}
			}
			arr[j+1] = temp;				
		}
    }
    
	public static void main(String[] args) {
    //	1. Write a insertion sort function to sort array and returns no of comparisions.
	 int[] arr =  {2,1,5,4,6,7,9,8,0,3};
	 System.out.println("Before sort");
	 for (int i : arr) {
		 System.out.print(i+" ");
	 }
	 
	 insertionSort(arr);
	 
	 System.out.println("After sort");
	 for (int i : arr) {
		 System.out.print(i+" ");
	 }
	}

}
