
public class LinkedList<T> {
	
	//inner node class containing data,next
	
	static class Node<T>{
		private T data;
		private Node next;
		
		public Node(T value) {
			this.data = value;
			this.next = null;
		}
	}
	
	private Node tail;
	private int counter;
	
	public LinkedList(){
		this.tail=null;
		this.counter = 0;
	}
	
//	2. Implement singly circular linked list using tail pointer (no head pointer). Compare time complexities of
//	all operations.
	
	 //T.C = O(1)
	public void addFirst(T value) {
		// create node
		Node<T> newNode = new Node<>(value);
		
		// check if list empty or not
		if(isEmpty()) {
			tail = newNode;
			newNode.next = tail;
		}
		// check if only single element is there
		else if(counter == 1){
			newNode.next = tail;
		    tail.next = newNode;
		}
		// 
		else {
			newNode.next = tail.next;
			tail.next = newNode;
		}
		counter++;
	}
	
	 //T.C = O(1)
	public void addLast(T value){
	    // create a node
		Node<T> newNode = new Node<T>(value);
		
		//check if empty
		if(isEmpty()) {
			tail = newNode;
			newNode.next = tail;
		}
		//check if only single element is there
		else if(counter == 1){
			tail.next = newNode;
			newNode.next = tail;
			tail = newNode;
		}
		else {
		    newNode.next = tail.next;
		    tail.next = newNode;
		    tail = newNode;
		}
		counter++;
	}
	
	 //T.C = O(1)
	public void delFirst() {
	     if(tail == null) return;
	     
	     if(counter == 1) {
	    	 tail = null;
	     }else {
	    	 tail.next = tail.next.next;
	     }
	     counter--;
	}
	
	public void delLast() {
         if(tail == null) return;
	     
	     if(counter == 1) {
	    	 tail = null;
	     }else {
	    	 //traverse
	    	 int i=1;
	    	 Node<T> traverse = tail.next;
	    	 
	    	 while( i < counter) {
	    		traverse =  traverse.next;
	    		i++;
	    	 }
	    	 // after traversing it would points to second last element
             traverse.next = tail.next;
             
//	    	 tail.next = tail.next.next;
	     }
	     counter--;
	}
	
	public void Display() {
		if(tail == null) return;
		
		Node<T> traverseRefernce = tail.next;
		int i=1;
		while(i<=counter && traverseRefernce.next!=null) {
		    //print
			System.out.print(traverseRefernce.data+" ");
			traverseRefernce = traverseRefernce.next;
			i++;	
		}
		
	}
	public boolean isEmpty(){
		return (tail == null)?true:false;
	}
	

}
