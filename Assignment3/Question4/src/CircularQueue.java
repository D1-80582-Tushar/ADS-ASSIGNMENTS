
public class CircularQueue {
      private int[] arr;
      private int front;
      private int rear;
      private final int SIZE;
      
      public CircularQueue() {
         this.arr=null;
         front = -1;
         rear = -1;
         SIZE = 10;
      }
      
      public CircularQueue(int size) {
    	  this.arr= new int[size];
          front = -1;
          rear = -1;
          SIZE = size;
      }
      
      // push pop peek isEmpty isFull
      public void push(int value) {
    	  if(!isFull()) {
    		  //pehle rear ko aghe leke jao 
    		  rear = (rear+1)%SIZE;
    		  //then add karo
    		  // for circular queue if 
    		  arr[rear] = value;    		  
    	  }
      }
      
      public int pop(){
    	  int value = -1;
    	  if(!isEmpty()) {
    		  value = arr[(front+1)%SIZE];
    		  front = (front+1)%SIZE;
    		  if(front == rear)
    				front = rear = -1;
    	  }
    	  return value;
      }
      
      public int peek() {
    	  int value =-1;
    	  if(!isEmpty()) {
    		 value = arr[(front+1)%SIZE];     
    	  }
    	  return value;
      }
      
      public boolean isEmpty() {
    	  if(front==rear && rear==-1) {
    		  return true;
    	  }
    	  return false; 
      }
      
      public boolean isFull() {
    	  if((front == -1 && rear == SIZE-1) || (front == rear && rear !=-1)) {
    		   return true;  
    	  }
    	  return false;
      }
      
}
