import java.util.Scanner;

public class Mainq8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		to find rank of an element in a stream of integers. rank: rank of a given integer "x", in stream is "total
//		no. of ele's less than or equal to x (including x).
//		Input: { 10, 20, 15, 3, 4, 4, 1 } Ouput: Rank of 4 is: 4
		int[] arr = { 10, 20, 15, 3, 4, 4, 1 };
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element for rank:");
		int x = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
             if(arr[i] <= x) {
            	 count++;
             }
		}
		System.out.println("Rank of "+x +"is:" +count);
		
	}

}
