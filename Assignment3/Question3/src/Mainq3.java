
public class Mainq3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //3. Write program to implement linear queue in which front and rear starts at 0.
		// repeating same thing in order of so is queue
		// repeating opposite to order of so is stack
		
	
		Queue q = new Queue(10);
		q.push(10);
		q.push(20);
		q.push(30);
		q.push(40);
		q.push(50);
		
		for (int i = 0; i < 5; i++) {
			System.out.print(q.peek() + " ");
			q.pop();
		}
		
		System.out.println("----------------");
		
		if(q.isEmpty()) {
			System.out.println("queue is empty");
		}
		
		// there is a wastage of memory,
        //as by putting front to front +1 
		// we are making memory not accessible permanently for linear queue
		for (int i = 0; i < 5; i++) {
          q.push(i+1);
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.print(q.peek() + " ");
			q.pop();
		}
		
		
		
	}

}
