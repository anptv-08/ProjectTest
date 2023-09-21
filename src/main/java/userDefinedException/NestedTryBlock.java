package userDefinedException;

public class NestedTryBlock {
public static void main(String args[]) {
try 	// main try block
{
	try	// second try block 
	{
		try	// third try block
		{
			int num[]={1,2,3,4,5};
			System.out.println(num[7]);
			
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}
			
		}
	catch(ArithmeticException e) {
		System.out.println("Arithmetic Exception");
	}
	
}
catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("Array Index OutofBound Exception");
}

}
}
