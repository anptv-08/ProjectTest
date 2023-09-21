package userDefinedException;

import java.io.IOException;

public class MultipleThrowsException {
public static void newMethod(int num) throws IOException,ClassNotFoundException{
	if(num==1) {
		throw new IOException("IO Exception Message");
	}
	else {
		throw new ClassNotFoundException("ClassNotFoundException Message");
	}
}
	public static void main(String[] args) {
		try {
		newMethod(1);
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		catch(ClassNotFoundException c) {
			System.out.println(c.getMessage());
		}
	}

}
