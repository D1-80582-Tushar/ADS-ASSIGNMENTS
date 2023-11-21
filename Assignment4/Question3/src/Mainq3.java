
public class Mainq3 {

	public static void main(String[] args) {
//		In singly linear list implement following operations. i. insert a new node after a given node ii. insert a
//		new node before a given node
        LinkedList<Integer> list = new LinkedList<>();
		
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		
	//  insert a new node after a given node 
//		list.addAfterNode(30, 50);
		
	//  insert a new node before a given node
		list.addBeforeNode(30,50);
		
		list.Display();
	}
}
