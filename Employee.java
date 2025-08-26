package lab1;

public class Employee {
	String name;
	int id;
	long salary;
	
	Employee(String n, int id, long s){
		this.name=n;
		this.id=id;
		this.salary=s;
	}
	
	public void displayDetails() {
		System.out.println("Employee name:" +name);
		System.out.println("Employee ID:" +id);
		System.out.println("Employee Salary:" +salary);
		System.out.println("----------------");
		
	}
	
	public void increaseSalary(double percentage) {
		double increment=salary * percentage/100;
		salary += increment;
		System.out.println("New Salary " + percentage + "%increase: " + salary);
	}

}

