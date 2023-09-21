package exceptionHanlding;

public class ThrowAndThrows {

	public static void printNames(String name[]) {
		String received[]= name;
		for(int i=0;i<=received.length;i++) {
			System.out.println(received[i]);
			
		}
		
		throw new ArrayIndexOutOfBoundsException("ArrayIndexOutOfBound Exception");
	}
	public static void main(String args[]) {
		
		String name[]= {"Anoop","Sandeep","Joseph","Aravind"};
		try {
			printNames(name);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println( " error :" + e);
		}
	}
	
	
}
