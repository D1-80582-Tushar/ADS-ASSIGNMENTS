public class LinkedList<T> {
	
	//Node is independent of linkedList so we can make it inner static class
	public static class Node<T>{
	     private T data;
	     private Node next;
	     
	     public Node() {
	    	 this.data=null;
	    	 this.next=null;
	     }
	     
		 public Node(T data) {
			super();
			this.data = data;
	 		this.next = null;
	    }
        
	 }
	
       private Node<T> head; //head of reference node type
       private Node<T> tail; //tail of reference node type
       private int counter;
       
       public LinkedList(){
    	    this.head = null;
    	    this.tail = null;
    	    this.counter=0;
       }
       
       public boolean isEmpty() {
    	   if(head == null && tail == null) {
    		   return true;
    	   }
    	   return false;
       }
       

       public void addInSort(T value) {
    	    //create a node
    	    Node<T> newNode = new Node<>(value);
    	    // check if list is empty
    	    if(isEmpty()) {
    		    head= newNode;
    	    }else if(counter == 1){
    	        head.next = newNode;	
    	    }
    	    else {
    	    	// check for sort
    	    	// create a traverse ref to head / first element
    	    	Node<T> traverseref = head;
    	    	
    	    	// next agar not null huya tabhi check karo "<" less than
    	    	while(traverseref.next!=null && (int)traverseref.next.data < (int)newNode.data) {
    	    	     traverseref = traverseref.next;	
    	    	}
    	    	
    	    	newNode.next =traverseref.next;
    	    	traverseref.next = newNode;
    	    }
    	    counter++;
       }
       
       // function level abstraction
       public void add(T value) {
    	   addInSort(value);
       }

 
       
       //T.C = O(n)
       public void Display() {
    	   Node traverse = head;
    	   
    	   // now traverse reference is pointing to the same as head is pointintg 
//    	   traverse = head;
    	   if(traverse==null) {
    		   return;
    	   }
    	   while( traverse!=null && traverse.next!=null) {
    		   //print the data
    		   System.out.print(traverse.data+" ");
    		   //move forward
    		   traverse = traverse.next;
    	   }
    	   
    	   //printing last not accessed node
    	   System.out.println(traverse.data);
    	   
       }
       
}
