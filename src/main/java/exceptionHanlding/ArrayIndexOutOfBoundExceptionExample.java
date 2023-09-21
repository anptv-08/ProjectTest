package exceptionHanlding;

public class ArrayIndexOutOfBoundExceptionExample {

	public static void main(String[] args) {
		int num[]= {2,3,4,5,6};
		try {
		num[7]=20/5;
		System.out.println(num[7]);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception ");
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bound exception");
		}
		
		catch(Exception e) {
			System.out.println("Generic Exception");
		}
		
	}

}
