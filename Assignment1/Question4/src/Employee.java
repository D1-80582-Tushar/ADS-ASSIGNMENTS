
public class Employee {
   private int id;
   private String name;
   private Double salary;

   public Employee() {
	   
   }
   
   public Employee(int id, String name, double d) {
	super();
	this.id = id;
	this.name = name;
	this.salary = d;
   }

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Double getSalary() {
	return salary;
}

public void setSalary(Double salary) {
	this.salary = salary;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}
   
  
} 
