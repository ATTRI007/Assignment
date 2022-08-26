package Collection;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Employee implements Comparable<Employee>{
private int id;
private String name;
private String department;
private double salary;
	@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
}
	public Employee(int id, String name, String department, double salary) {
	super();
	this.id = id;
	this.name = name;
	this.department = department;
	this.salary = salary;
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
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Employee> t=new TreeSet<Employee>(); 
		
		 Employee e1=new Employee(1,"vartika","developer",56586989);
		 Employee e2=new Employee(2,"gdjgdj","developer",56586989);
		 Employee e3=new Employee(3,"va","developer",6989);
		 Employee e4=new Employee(4,"var","tester",89989);
		 Employee e5=new Employee(5,"varta","developer",3566989);
		 Employee e6=new Employee(6,"varti","developer",99989);
		 Employee e7=new Employee(7,"vka","support",86989);
		 Employee e8=new Employee(8,"artika","developer",56989);
		 Employee e9=new Employee(9,"rtika","support",565889);
		 Employee e10=new Employee(10,"ika","developer",565869);
		 
		 t.add(e1);
		 t.add(e2);
		 t.add(e3);
		 t.add(e4);
		 t.add(e5);
		 t.add(e6);
		 t.add(e7);
		 t.add(e8);
		 t.add(e9);
		 t.add(e10);
		 
		/* Scanner sc = new Scanner(System.in);
			System.out.println("Enter the employee name u want  ");
			String output= sc.nextLine();*/
			
			for(Employee e : t)
			{
				
				{
					System.out.println(e.id + " " + e.name + " "+ e.department +" "+ e.salary);
					
				}



			}

			



		 
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		 return name.compareTo(o.name);
	}

}
