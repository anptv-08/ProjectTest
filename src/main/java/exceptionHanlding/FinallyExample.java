package exceptionHanlding;

public class FinallyExample {

	public static void main(String[] args) {
		try {
			String s=null;
			
			int b=s.length();
			int a=10/0;
			System.out.println(a);
			System.out.println("abcdefg");
		}
		
		catch(NullPointerException e) {
			System.out.println("NullPointer Exception, You entered a null value");
		}
		
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exception ");
		}
		finally {
			System.out.println("Finally exception statement");
		}

	}

}
