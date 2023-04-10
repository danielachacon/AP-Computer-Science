package unit12.lab2;

/*
 * IllegalArgumentException - Runtime Exception
 * Thrown when a method has been passed illegal or unsuitable arguments 
 */
public class IllegalArgumentExceptionCatch  
{

	public static void main(String[] args) 
	{
		int result;
		System.out.println("IllegalArgumentExceptionThrown class only accepts positive integer values.\nThe class throws IllegalArgumentException for any negative value received as an argument.");
		System.out.println("Test argument values:");
		
		IllegalArgumentExceptionThrown ex = new IllegalArgumentExceptionThrown();
		try 
		{
			System.out.println("\nPassing 2 as an argument...");
			result = ex.increment(2);
			System.out.println("SUCCESS: newly incremented value is: " + result);
		} 
		catch (IllegalArgumentException e) 
		{
			System.out.println("ERROR: Received a negative number. Exception : " + e);
		}
		try 
		{
			System.out.println("\nPassing -100 as an argument...");
			result = ex.increment(-100);	
			System.out.println("SUCCESS: newly incremented value is: " + result);
		} 
		catch (IllegalArgumentException e) 
		{
			System.out.println("ERROR: Received a negative number. Exception : " + e);
		}
	}

}
