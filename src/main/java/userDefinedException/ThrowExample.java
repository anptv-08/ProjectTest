package userDefinedException;

public class ThrowExample {
public static void name() {
	throw new ArithmeticException("Msg");
}

public static void main(String args[]) {
try {
	name();
}
catch(ArithmeticException e) {
	System.out.println(e.getMessage());
}
}
}
