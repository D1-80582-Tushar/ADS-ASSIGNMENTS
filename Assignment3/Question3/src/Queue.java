
public class Queue {
    private int[] arr;
    private int rear;
    private int front;
    private final int SIZE;
    private int capacity;
    
    public Queue() {
    	this.SIZE = 0;
		this.arr = null;
    	this.rear = -1;
        this.front = -1;
        this.capacity = 0;
    }
    // push pop isempty peek isfull
	public Queue(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = rear = -1;
	}
	
	
    public void push(int value){
	    rear++;
	    this.arr[rear] = value;
	}
    
    public int pop() {
    	// value of element that is going to be deleted
    	int value = arr[front+1];
    	
    	// by doing front++ we are taking wall + 1 to index
     	front++;
    	
    	return value;
    }
    
    public int peek() {
    	// at front there is our wall at front+1 room started
       	return arr[front+1];
    }
    
    public boolean isEmpty() {
    	return (front == rear)?true:false;
    }
    
    public boolean isFull() {
    	if(rear == SIZE-1) {
    		return true;
    	}
    	return false;
    }
} 
