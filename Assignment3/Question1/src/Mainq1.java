
public class Mainq1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	1. Insert 5 elements in stack and find maximum value in stack without traversing it.
		Stack st = new Stack(10);
		st.push(10);
		st.push(30);
		st.push(20);
		st.push(40);
		st.push(14);
        
		int result = st.max(st);
		System.out.println("Max :"+ result);
		st.Display();
//		while(st.peek())
	}

}
