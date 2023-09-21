package exceptionHanlding;

public class NestedTryBlock2 {

	public static void main(String[] args) {
		try {		// main try
			try {
				int a=10;
				int result=a/0;
				System.out.println(result);
			}
			catch(ArithmeticException e1) {
				System.out.println("Arithmetic Exception1");
			}
			
			try {
				int a=10;
				int result=a/0;
				System.out.println(result);
			
			}
			catch(ArithmeticException e2) {
				System.out.println("Arithmetic Exception2");
			}
				
		}
		catch(ArithmeticException e3) {
			System.out.println("Arithmetic Exception");
		}
		catch(ArrayIndexOutOfBoundsException e4) {
			System.out.println("ArrayIndexOutOfBounds Exception");
		}
		catch(Exception e5) {
			System.out.println("Exception");
		}
		System.out.println("Exception handling");

	}

}
