import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Mainq1 {
    
	public static <T> boolean TwoPointerPalindromeApproch(T[] arr) {
        // time complexity --> O(n/2) ==> O(n)
		// space complexity --> Auxilary space complexity ==> O(1)
		int start = 0;
        int end = arr.length-1;
        
        while(start<=end) {
             if(arr[start] == arr[end]) {
            	 start++;
            	 end--;
             }else {
            	 return false;
             }
        }
        
	 	return true;	
    }
    
	public static <T> boolean reverseListPalindromeApproch(T[] arr) {
	   //time complexity --> O(n/2)+O(n) == >O(n)
	   //space complexity --> Auxilary complexity ==> O(n)
		
		T[] arrcopy = arr.clone();
		
		//reverse list
		int start = 0;
	    int end = arr.length-1;
	    
	    while(start<=end) {
	    	//swap
	    	T temp = arrcopy[start];
	    	arrcopy[start] = arrcopy[end];
	    	arrcopy[end] = temp;
	        start++;
	        end--;
	    }
	    
	    for (int i = 0; i < arrcopy.length; i++) {
			if(!arr[i].equals(arrcopy[i])) {
				return false;
			}
		}
	    return true;
	}
	
	
	
	public static <T> boolean palindromeStack(T[] arr) {
		  // time complexity --> O(n)+O(n) -->O(n)
		  // space complexity --> O(n)
		
	      Stack<T> st = new Stack<>();
		  for (int i = 0; i < arr.length; i++) {
			    st.push(arr[i]);
		  }
		  
		  for (int i = 0; i < arr.length; i++) {
			   T curr = st.pop();
				if(!curr.equals(arr[i])) {
					return false;
				}
			}
		    return true;   	     
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //	1. Write all possibilites to check palindrome. Also do time and space complexity analysis.
		
		// 1 reverse list
		// 2 two pointer approch
		// 3 stack 
	    
		Integer[] arr = {9,8,7,6,3,6,7,8,9};
	    Character[] str = {'a','b','a'};
	    Double [] arr1 = {9.0,8.5,7.2,8.5,9.0};
 //		if(TwoPointerPalindromeApproch(str)) {
//	    	System.out.println("its");
//	    }else {
//	    	System.out.println("its not");
//	    }
		 
//		if(reverseListPalindromeApproch(arr1)) {
//	    	System.out.println("its");
//	    }else {
//	    	System.out.println("its not");
//	    }
	    
		 
			if(palindromeStack(arr1)) {
		    	System.out.println("its");
		    }else {
		    	System.out.println("its not");
		    }
		    
		
	}
}
