package interfacePackage;

public class InterfaceExample extends BankImpl {

	
	public static void main(String args[]) {
		InterfaceExample ie=new InterfaceExample();
		ie.account();
		ie.loan();
		ie.credit();
		ie.carLoan();
		ie.debit();
	}
}
