package interfacePackage;

public class BankImpl implements Bank,Bank2 {

	public void account() {
		System.out.println("This method displays current account");
	}
	
	public void loan() {
		System.out.println("This method displays loans");
	}
	
	public void credit() {
		System.out.println("Credit");
	}
	
	public void debit() {
		System.out.println("Debit");
	}
	
	public void carLoan() {
		System.out.println("Car loan");
	}
}
