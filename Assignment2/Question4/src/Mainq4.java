

class Stack{
	private int[] arr;
	private int top;
	
	Stack(){
		this.top=-1;
		this.arr = null;
	}
	
	Stack(int size){
		this.arr = new int[size];
		this.top = size;
	}
	
	// push , pop , peek
	public void push(int value) {
	  this.top--;
	  arr[top] = value;
	}
	
	public int pop() {
		//pop element
	   return  arr[top++];	
	}
	
	public int peek() {
	    return arr[top]; 	
	}
	
}
public class Mainq4 {
	
//	Write a program to implement descending stack.
	public static void main(String[] args) {
	       Stack s  = new Stack(5);
	       s.push(5);
	       s.push(4);
	       s.push(3);
	       s.push(2);
	       s.push(1);
	       s.pop();
	       System.out.println(s.peek());
	}

}
