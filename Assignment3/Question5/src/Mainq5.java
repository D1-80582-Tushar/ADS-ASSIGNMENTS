
public class Mainq5 {
   
	public static int calculate(int op1,int op2,char exp) {
		  switch (exp) {
			case '+':return op1 + op2;
			case '-':return op1 - op2;
			case '*':return op1 * op2;
			case '/':return op1 / op2;
			case '%':return op1 % op2;
			case '$':return (int) Math.pow(op1,op2);
			}
	        return 0;
	}

	public static int postFixEvaluation(String exp) {
		char[] charArr = exp.toCharArray();
		Stack st = new Stack(50);
	
		for (char c : charArr) {
			 if(Character.isDigit(c)) {
				 st.push(c-'0');
			 }else {
				 int op1 = st.pop();// 2 1st will become 2nd operand in postfix
				 int op2 = st.pop();// 1 2nd will become 1st 
				 int result = calculate(op2,op1,c);
				 st.push(result);
			 }
		}
		
		if(!st.isEmpty()) {
			return st.pop();
		}
		return 0;
	}
	
	public static int postFixEvaluationMulti(String exp) {
		
		String[] charArr = exp.split(" ");
		Stack st = new Stack(20);
	
		for (String c : charArr) {
			 int n = c.length();
			 if(Character.isDigit(c.charAt(n-1))) {
				 st.push(Integer.parseInt(c));
			 }else {
				 int op1 = st.pop();// 2 1st will become 2nd operand in postfix
				 int op2 = st.pop();// 1 2nd will become 1st
				 
				 int result = calculate(op2,op1,c.charAt(n-1));
				 st.push(result);
			 }
		}
		
		if(!st.isEmpty()) {
			return st.pop();
		}
		return 0;
	}
	
	
	
	public static int prefixEvaluation(String exp) {
		   char[] chararr = exp.toCharArray();
		   Stack st = new Stack(20);
		   for(int i =chararr.length-1;i>=0;i--) {
			     if(Character.isDigit(chararr[i])) {
			    	 st.push(chararr[i]-'0');
			     }else {
			    	 int operand1 = st.pop(); // 1
			    	 int operand2 = st.pop();// 2
			    	 
			    	 int result = calculate(operand1,operand2,chararr[i]);
			    	 st.push(result);
			     }
		   }
		   
		   if(!st.isEmpty()) {
			   return st.pop();
		   }
		   return 0;
	}
	
	public static void main(String[] args) {
        // Implement following algorithms for multi digit numbers
		// i. post fix evaluation
		String postfix = "456*3/+9+7-";
		
		System.out.println("Post : " + postfix);
		int result = postFixEvaluation(postfix);
		System.out.println("Result : " + result);
		
		String postfixmulti = "250 100 - 25 / 11 * 9 -";
		
		System.out.println("Post : " + postfixmulti);
		int result1 = postFixEvaluationMulti(postfixmulti);
		System.out.println("Result : " + result1);
		// ii. prefix evaluation
		String prefix = "-++4/*56397";
		System.out.println("prefix : " + prefix);
		int resultprefix = prefixEvaluation(prefix);
		System.out.println("Result : " + resultprefix);

	}

}
