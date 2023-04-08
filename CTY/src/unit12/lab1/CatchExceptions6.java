package unit12.lab1;

import java.util.Scanner;

public class CatchExceptions6 
{
	public static int divide(int x, int y) throws DivideByZeroException
	{
		int result = 0;
		try
		{
			result = x/y;
		}
		catch(ArithmeticException e)
		{
			throw new DivideByZeroException(y);
		}
		return result;
	}
	
	public static void main(String[] args)
	{
		int numerator;
		int denominator;
		int quotient = 0;
		Boolean success = false;
		Scanner input = new Scanner(System.in); 
	
		
		while(success == false)
		{
			try
			{
				System.out.print("Enter numerator: ");
				numerator = input.nextInt();
				System.out.print("Enter denominator: ");
				denominator = input.nextInt();
				quotient = divide(numerator,denominator);
				success = true;
			}
			catch(DivideByZeroException e)
			{
				System.out.print("Denominator must be nonzero... enter again\n");
			}
		}
		System.out.print("Quotient is: " + quotient);
	}

}
