/*
 * Lets first create the superclass Employee and define a method called calculateSalary() as an abstract method. 

The Contractor class inherits all properties from its parent Employee but have to provide its own implementation of calculateSalary() method and multiply the value of payment per hour with given working hours. 
The FullTimeEmployee also has its own implementation of calculateSalary()method. In this case we just multiply by constant 8 hours.
 */
package abstractionAssignment;

public class Contractor {
private int salary, hours;
public void calculateSalary(int hours) {
	this.hours=hours;
	salary=hours*1000;
}

public float getSalary() {
	return salary;
}
public void displaySalary() {
	System.out.println("Contract Employee Salary : "+salary+", Employee worked "+hours+" hours");
}
}
