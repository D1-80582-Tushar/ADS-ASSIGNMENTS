
public class Mainq2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2. Implement singly circular linked list using tail pointer (no head pointer). Compare time complexities of
//		all operations.
		LinkedList<Integer> list = new LinkedList<>();

		list.addFirst(10);
		list.addFirst(30);
		list.addFirst(20);
		list.addFirst(40);
		list.addLast(50);
		list.addLast(60);
		list.addLast(70);
//		list.addLast(80);
//		list.addFirst(90);
//		list.addFirst(100);
//		list.delFirst();
//		list.delFirst();
//		list.delFirst();
//		list.delFirst();
//		list.delLast();
//		list.delLast();
		list.Display();
	}

}
