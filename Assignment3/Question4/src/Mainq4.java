import java.util.Scanner;

public class Mainq4 {

	public static void main(String[] args) {
		CircularQueue cq = new CircularQueue(5);
		int choice;
		Scanner sc = new Scanner(System.in);
		
		
		do {
			System.out.println("0. Exit\n1. Push\n2. pop\n3. Peek");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				if(cq.isFull())
					System.out.println("Queue is full");
				else {
					System.out.print("Enter data : ");
					int data = sc.nextInt();
					cq.push(data);
				}
				break;
			case 2:
				if(cq.isEmpty())
					System.out.println("Queue is empty");
				else
					System.out.println("Popped data : " + cq.pop());
				break;
			case 3:
				if(cq.isEmpty())
					System.out.println("Queue is empty");
				else
					System.out.println("Peeked data : " + cq.peek());
				break;
			}
		}while(choice != 0);
		sc.close();
	}
	

}
