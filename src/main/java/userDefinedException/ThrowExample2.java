package userDefinedException;

public class ThrowExample2 {

	public static void eligibiltyCheck(int age,int height) {
		if(age<18 && height <168) {
			throw new ArithmeticException("Student is not eligible for registration");
		}
		else {
			System.out.println("Student is eligible for registration");
		}
	}
	
	public static void main(String args[]) {
		System.out.println("Welcome!");
		try {
		eligibiltyCheck(16,150);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			
		}
	}
}
