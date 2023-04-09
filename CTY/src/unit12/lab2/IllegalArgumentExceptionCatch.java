package unit12.lab2;

/*
 * IllegalArgumentException - Runtime Exception
 * Thrown when a method has been passed illegal or unsuitable arguments 
 */
public class IllegalArgumentExceptionCatch  
{

	public static void main(String[] args) 
	{
		IllegalArgumentExceptionThrown ex = new IllegalArgumentExceptionThrown();
		try 
		{
			ex.IllegalArgumentExceptionMethod(-100);
		} 
		catch (IllegalArgumentException e) 
		{
			System.out.println("Received a negative number! Exception : " + e);
		}
	}

}
