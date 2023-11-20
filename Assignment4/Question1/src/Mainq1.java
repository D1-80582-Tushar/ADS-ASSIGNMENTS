
public class Mainq1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //		1. Implement a singly linear linked list with head and tail pointer. Implement addFirst(), addLast(),
        //		delFirst(), delLast, display() operations.
		LinkedList<Integer> list = new LinkedList<>();
		
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		list.addFirst(40);
		list.addLast(50);
		list.addLast(60);
		list.addLast(70);
//		list.delFirst();
//		list.delFirst();
//		list.delFirst();
//		list.delFirst();
//		list.delFirst();
//		list.delFirst();
		list.delLast();
		list.delLast();
		list.Display();
		
		
	}

}
