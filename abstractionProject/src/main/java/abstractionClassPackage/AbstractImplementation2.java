package abstractionClassPackage;

public class AbstractImplementation2  extends AbstractImplementation{
	
	public void display() {
		System.out.println("Absctract method defined");
	}
	
	public static void main(String args[]) {
		AbstractImplementation2 ai=new AbstractImplementation2();
		ai.tearDown();
		ai.setUp();
		ai.display();
		ai.process();
		
	}
}
