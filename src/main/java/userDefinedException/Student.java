package userDefinedException;

public class Student {

	public static void studentAge(int age) throws AnoopException {
		if(age<6) {
			throw new AnoopException("student is not eligible for registration");
		}
		else {
			System.out.println("Student is eligible for registration");
		}
	}
	public static void main(String[] args) {
		try {
		studentAge(3);
		}
		catch(AnoopException a) {
			System.out.println(a.getMessage());
		}
	}

}
