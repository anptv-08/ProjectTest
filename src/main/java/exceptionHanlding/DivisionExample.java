package exceptionHanlding;

import java.util.Scanner;

public class DivisionExample {

	public static void main(String args[]) {
		int num1,num2,result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		num1=sc.nextInt();
		System.out.println("Enter second number");
		num2=sc.nextInt();
		try {
		result=num1/num2;
		System.out.println("Result : "+result);
		}
		
		catch(ArithmeticException e) {
			System.out.println("Divide by zero is not possible");
			System.out.println(e);
			
		}
		
		
		
	}
}
