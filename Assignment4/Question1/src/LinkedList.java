//
//
//public class List {
//	static class Node{
//		private int data;
//		private Node next;
//		private Node prev;
//		public Node(int value) {
//			data = value;
//			next = null;
//			prev = null;
//		}
//	}
//	
//	private Node head;
//	private Node tail;
//	
//	public List() {
//		head = null;
//		tail = null;
//	}
//	
//	public boolean isEmpty() {
//		return head == null && tail == null;
//	}
//	
//	public void fDisplay() {
//		//1. create trav and start at head
//		Node trav = head;
//		System.out.print("Forward : ");
//		while(trav != null) {
//			//2. print data of current node
//			System.out.print(" " + trav.data);
//			//3. go on next node
//			trav = trav.next;
//		}//4. repeat step 2 and 3 till last node
//		System.out.println("");
//	}
//	
//	public void rDisplay() {
//		//1. create trav and start at tail
//		Node trav = tail;
//		System.out.print("Reverse : ");
//		while(trav != null) {
//			//2. print data of current node
//			System.out.print(" " + trav.data);
//			//3. go on prev node
//			trav = trav.prev;
//		}//4. repeat step 2 and 3 till first node
//		System.out.println("");
//	}
//	
//	public void addFirst(int value) {
//		//1. create node
//		Node nn = new Node(value);
//		//2. if list empty
//		if(isEmpty())
//			//a. add newnode into head and tail
//			head = tail = nn;
//		//3. if list not empty
//		else {
//			//a. add first node into next of newnode
//			nn.next = head;
//			//b. add newnode into prev of first node
//			head.prev = nn;
//			//c. move head on newnode
//			head = nn;
//		}
//	}
//	
//	public void addLast(int value) {
//		//1. create node
//		Node nn = new Node(value);
//		//2. if list empty
//		if(isEmpty())
//			// add newnode into head and tail
//			head = tail = nn;
//		//3. if list is not empty
//		else {
//			//a. add last node into prev of newnode
//			nn.prev = tail;
//			//b. add newnode into next of last node
//			tail.next = nn;
//			//c. move tail on newnode
//			tail = nn;
//		}
//	}
//	
//}


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
       
//		 Implement addFirst(), addLast(),
       //		delFirst(), delLast, display() operations.
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
