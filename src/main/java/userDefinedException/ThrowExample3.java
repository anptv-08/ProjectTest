package userDefinedException;

public class ThrowExample3 {
public void display()throws ArithmeticException{
	throw new ArithmeticException("This is an Arithmetic Exception");
}

public void show(){
	try {
	display();
	}
	catch(ArithmeticException e) {
		System.out.println(e.getMessage());
	}
}
	public static void main(String[] args) {
	
		ThrowExample3 th=new ThrowExample3();
		th.show();
	}

}
