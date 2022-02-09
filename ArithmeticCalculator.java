//import package from Scanner class
import java.util.Scanner; 

public class ArithmeticCalculator {

	public static void main(String args[]) {
		
		//declare num1 & num2 for the 2 values the operation is working with plus a result 
		double num1 = 0;
		double num2 = 0;
		double result = 0;
		byte choice = 0;
		
		//Set up a scanner object
		Scanner scan = new Scanner(System.in);
		
		//generate a main menu for the calculator operations
		System.out.println("ARITHMETIC CALCULATOR");
		System.out.println("select 1 for +");
		System.out.println("select 2 for -");
		System.out.println("select 3 for *");
		System.out.println("select 4 for /");
		choice = scan.nextByte();
		
		//information line for user to enter first value
		System.out.println("Enter first value: ");
		//get input from user then store to variable
		num1 = scan.nextDouble(); 
		
		//information line for user to enter second value
		System.out.println("Enter second value: ");
		num2 = scan.nextDouble();
		
		//check if user selected addition
		if(choice == 1) {
			//perform addition
			result = num1 + num2;
			System.out.println("The sum is: " + result);
		}
		//otherwise if user selected substraction
		else if(choice == 2)
		{
			//perform substraction
			result = num1 - num2;
			System.out.println("The difference is: " + result);
		}
		//otherwise if user selected multipication
		else if(choice == 3)
		{
			//perform multiplication
			result = num1 * num2;
			System.out.println("The product is: " + result);
		}
		//if user selected division 
		else if(choice == 4)
		{
			//perform division
			result = num1 / num2;
			System.out.println("The quotient is: " + result);
			
		}
		//otherwise selected operation is invalid 
		else
			System.out.println("invalid, select a operation from 1 to 4");
	}
}
