package unit12.lab1;

import unit9.Input;

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
		System.out.println();
		try
		{
			divide(10,0);
		}
		catch(DivideByZeroException e)
		{
			try
			{
				int n = Input.getInt("Denominator must be nonzero... enter again");
				divide(10,n);
			}
			catch(DivideByZeroException ex)
			{
				System.out.println("Sorry... You had your chance");
			}
		}
	}

}
