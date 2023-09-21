package userDefinedException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExample {

	public static void print()throws FileNotFoundException{
	
		FileInputStream f=new FileInputStream("C:\\test.doc");
	}
	
	
public static void main(String args[]) {
try {
print();
}
catch(FileNotFoundException f) {
	System.out.println(f.getMessage());
}
}
}
