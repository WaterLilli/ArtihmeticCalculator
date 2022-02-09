import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String args¢[]) {
		
		double num1 = 0;
		double num2 = 0;
		double result = 0;
		byte choice = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ARITHMETIC CALCULATOR");
		System.out.println("select 1 for +");
		System.out.println("select 2 for -");
		System.out.println("select 3 for *");
		System.out.println("select 4 for /");
		choice = scan.nextByte();
		
		System.out.println("Enter first value: ");
		num1 = scan.nextDouble();
		
		System.out.println("Enter second value: ");
		num2 = scan.nextDouble();
		
		if(choice == 1) {
			
			result = num1 + num2;
			System.out.println("The sum is: " + result);
		}
		else if(choice == 2)
		{
			result = num1 - num2;
			System.out.println("The difference is: " + result);
		}
		else if(choice == 3)
		{
			result = num1 * num2;
			System.out.println("The product is: " + result);
		}
		else if(choice == 4)
		{
			result = num1 / num2;
			System.out.println("The quotient is: " + result);
			
		}
		else
			System.out.println("invalid, select a operation from 1 to 4");
	}
}
