import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Mainq4 {

	public static <T> Employee searchEmployee(Collection<Employee> emps,T searchby) {
		for (Employee employee : emps) {
			if(searchby instanceof Integer) {
				if(searchby.equals(employee.getId())) {
					return employee;
				}				
			}else if(searchby instanceof Double) {
				if(searchby.equals(employee.getSalary())) {
					return employee;
				}	
			}else {
				if(searchby.equals(employee.getName())) {
					return employee;
				}	
			}
		}
		return null;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		4. Create array of employees and search employee by i. empid ii. name iii. salary
		Collection<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1,"harry",5000.2));
		employees.add(new Employee(2,"carry",5400.3));
		employees.add(new Employee(3,"marry",5500.4));
		employees.add(new Employee(4,"cherry",3000.5));
		
//		System.out.println("enter employee salary");
//		Scanner sc = new Scanner(System.in);
//		Employee emp = searchEmployee(employees,sc.nextDouble());
//		

		System.out.println("enter employee name");
		Scanner sc = new Scanner(System.in);
		Employee emp = searchEmployee(employees,sc.next());
		
		if(emp!=null) {
			System.out.println(emp);			
		}else {
			System.out.println("NOt FOund");
		}
		
	}

}
