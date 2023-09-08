package abstractionClassPackage;

public abstract class AbstractExample {

	public void setUp() { // concrete method or non abstract
		System.out.println("Print this");
	}
	
	public void tearDown() {
		System.out.println("This is a non abstract method");
	}
	
	public abstract void display(); // abstract method declared, definition written in non abstract class
	
	
}
