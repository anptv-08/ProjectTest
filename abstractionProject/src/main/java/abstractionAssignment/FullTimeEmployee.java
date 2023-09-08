/*
 * Lets first create the superclass Employee and define a method called calculateSalary() as an abstract method. 

The Contractor class inherits all properties from its parent Employee but have to provide its own implementation of calculateSalary() method and multiply the value of payment per hour with given working hours. 
The FullTimeEmployee also has its own implementation of calculateSalary()method. In this case we just multiply by constant 8 hours.
 */

package abstractionAssignment;

public class FullTimeEmployee extends Employee {
	private int salary;
	public int calculateSalary() {
		salary=8*1500;
		return salary;
	}

	public void displaySalary() {
		System.out.println("Full Time Employee Salary : "+salary+" , Employee worked 8 hours");
	}
	public static void main(String[] args) {
		FullTimeEmployee fe=new FullTimeEmployee();
		fe.calculateSalary();
		fe.displaySalary();

		Contractor con=new Contractor();
		con.calculateSalary(5);
		con.displaySalary();
	}

}
