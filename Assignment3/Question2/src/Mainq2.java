import java.util.Iterator;

public class Mainq2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {1,5,2,4,3,6,7,8,9};
        
//       2. Create an array of integers. Reverse the array using stack
        Stack st = new Stack(10);
        for (int i = 0; i < arr.length; i++) {			
        	st.push(arr[i]);        
		}
     
        for (int i = 0; i < arr.length; i++) {
			System.out.print(st.pop()+" ");
		}
	}

}
