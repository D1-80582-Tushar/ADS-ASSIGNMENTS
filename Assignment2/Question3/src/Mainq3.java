import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mainq3 {

	public static void bubbleSort(ArrayList<Employee> emps) {
		int count = 0; 
		
        for(int round = 1;round <= emps.size();round++) {
               boolean flag = false;
        	   for(int j=0;j<emps.size() - round;j++) {
        		   count++;
        		   if(emps.get(j).getSalary() > emps.get(j+1).getSalary()) {
        			      Employee temp = emps.get(j);
        			      emps.set(j,emps.get(j+1));
        			      emps.set(j+1,temp);
        			      flag = true;
        		   }
        	   }
        	   if(!flag) {
        		   break;
        	   }
        }
        System.out.println("number of comparision:"+count);
        
	}
	public static void main(String[] args) {
    //	3. Write a function to sort employees by their salary.
		ArrayList<Employee> emps = new ArrayList<Employee>();
	
		emps.add(new Employee(1, "suman", 5005.0));
	    emps.add(new Employee(3, "ruman", 4050.0));
	    emps.add(new Employee(2, "kuman", 5005.0));
	    emps.add(new Employee(5, "human", 4302.0));
	    emps.add(new Employee(4, "euman", 5404.0));
	    emps.add(new Employee(6, "xuman", 5808.0));
	    
//	    Collections.sort(emps,(x,y)-> Double.compare(x.getSalary(),y.getSalary()));
	    
		 System.out.println("Before sort");
		  for (Employee employee : emps) {
				System.out.println(employee);
			}
	        
		 System.out.println();
		 bubbleSort(emps);
		 
		 System.out.println("After sort");
		 
        for (Employee employee : emps) {
			System.out.println(employee);
		}
        
	}

}
