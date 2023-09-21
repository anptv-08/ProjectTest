package exceptionHanlding;

public class MultipleCatchExample {

	public static void main(String[] args) {
		int num1,num2,result;
		try {
			num1=10;
			num2=0;
			result=num1/num2;
			System.out.println("Result "+result);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out of Bound Exception");
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception Division by Zero");
		}
		
		catch(Exception e) {
			System.out.println("Generic Exception");
		}
		
		System.out.println("Out of try catch block");
 
		
	}

}
