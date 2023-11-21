import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Stack{
     private int[] arr;
     private int size;
     private int capacity;
     private int top;
     private static int max_value;
     public Stack() {
    	 this.arr = null;
    	 this.top=-1;
    	 this.capacity=0;
    	 this.size=0;
    	 this.max_value= 0;
     }
     
     public Stack(int size) {
    	 this.arr = new int[size];
    	 this.top=-1;
    	 this.capacity=0;
    	 this.size=0;
    	 this.max_value=0;
     }
     
     public void push(int value) {
    	  this.arr[++top] = value;
    	  capacity++;
     }
     
     public int pop() {
    	 capacity--;
    	 return this.arr[top--];
     }
     
     public int peek() {
    	 return this.arr[top];
     }
     
     public boolean isEmpty() {
         if(capacity == 0) {
        	 return true;
         }
         return false;
     }
     
     public static void findMax(Stack st) {
    	 //base case
    	 if(st.isEmpty()) {
    		 return;
    	 }
    		 
    	 int temp = st.pop();
    	 
    	 findMax(st);
    	 
    	 //back track
    	 if(temp > max_value) {
    		 max_value = temp;
    	 }
     }
     
     public int max(Stack st) {
    	  findMax(st);
    	  return max_value;
     }
     
     public void Display() {
          for (int i = 0; i < capacity; i++) {
			  System.out.print(arr[i]+" ");
		  }
          
//    	  for (int i : arr) {
//		  }
     }
}
