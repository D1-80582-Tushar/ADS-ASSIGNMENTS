
public class LinkedList<T> {
    
	static class Node<T>{
		private T data;
		private Node next;
		
		public Node(T value) {
			this.data = value;
			this.next = null;
		}
	}
	
	private Node head;
	private Node tail;
	private int counter;
	
	
	public LinkedList() {
	    this.head=null;
	    this.tail=null;
	    this.counter=0;
	}
	
	  public boolean isEmpty() {
   	   if(head == null && tail == null) {
   		   return true;
   	   }
   	   return false;
      }
      

      //T.C = O(1)
      public void addFirst(T value) {
   	    //create a node
   	    Node<T> newNode = new Node(value);
   	    //check if list is empty
   	    if(isEmpty()){
   	        head = tail = newNode;	
   	    }else {
   	    	//not empty
   	    	newNode.next = head;
   	    	head = newNode;	
   	    }
   	    counter++;
      }
    //T.C = O(1)
    public void addLast(T value) {
 	   //step:1 create a node
 	    Node<T> newNode = new Node<>(value);
 	   
 	    // step 2: check if list is empty or not
 	    if(isEmpty()) {
 	    	
 	    	//if its empty do put the newNode pointing reference to newNode 
 	    	head = tail = newNode;
 	   
 	    }else {
 	    	//if its not empty then 
 	    	// 1st do put the tail.next reference to newNode
 	    	// then update tail reference to newNode
 	    	tail.next = newNode;
 	    	tail = newNode;
 	    }
 	    counter++;
 	    
    }
    
    //T.C = O(1)
    public void delFirst() {
 	    // if empty
 	   if(isEmpty()) {
 		   return;
 	   }
 	   // if size == 1 
 	   else if(counter == 1){
 		   head = tail = null;
 	   }
 	   else{
 		   head = head.next;
 	   }
 	   counter--;
    }
    
    //T.C = O(n)
    public void delLast() {
 	   //if empty
 	   if(isEmpty()) {
 		    return;
 	   }
 	   else if(counter==1){
 	
 		   head = tail = null;
 	
 	   }else {
 	      // we cannot do tail = tail.prev as its singly linked list
 		   //so 1st we need to traverse over it
 		   //create a temprary traverse reference pointing to head
 		   Node<T> traverseReference = head; 
 		   while(traverseReference!=null) {
 			   if(traverseReference.next.next==null) { //stop at second last as we need to get track of on previous node before last
 				       traverseReference.next = null;
 				       tail = traverseReference;
 				       traverseReference = null;
 			   }else {
 				   traverseReference = traverseReference.next;
 			   }
 		   }
 	   }
 	   counter--;
    }
    
    
    public void addAfterNode(T value,int newValue) {
        //create a node
   	    Node<T> newNode = new Node(newValue);
   	    Node<T> oldNoderef = new Node(value);
        // if list empty add it to head
    	if(isEmpty()) {
    		head = newNode;
    	}
    	// if not add after given node
    	else {
    		// traverse over list up to that node
    		Node traverseref = head;
    		
    	    // for node traverse until temp.next.data != givennode.data
    		while(traverseref.next.data !=  oldNoderef.data) {
    			traverseref = traverseref.next;
    		}
    		
    		traverseref = traverseref.next;
    		
    		newNode.next = traverseref.next;
    		
    		// then add    		
    		traverseref.next = newNode;
    	}
    }
    
    public void addBeforeNode(T value,int newValue) {
        //create a node
   	    Node<T> newNode = new Node(newValue);
   	    Node<T> oldNoderef = new Node(value);
        // if list empty add it to head
    	if(isEmpty()) {
    		head = newNode;
    	}
    	// if not add after given node
    	else {
    		// traverse over list up to that node
    		Node traverseref = head;
    		
    	    // for node traverse until temp.next.data != givennode.data
    		while(traverseref.next.data !=  oldNoderef.data) {
    			traverseref = traverseref.next;
    		}
    		    		
    		newNode.next = traverseref.next;
    		
    		// then add    		
    		traverseref.next = newNode;
    	}
    }
    
    
    //T.C = O(n)
    public void Display() {
 	   Node traverse = head;
 	   
 	   // now traverse reference is pointing to the same as head is pointintg 
// 	   traverse = head;
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
