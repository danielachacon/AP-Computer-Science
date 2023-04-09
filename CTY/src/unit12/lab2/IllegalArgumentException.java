package unit12.lab2;

/*
 * IllegalArgumentException - Runtime Exception
 * Thrown when a method has been passed illegal or unsuitable arguments 
 */
public class IllegalArgumentException extends Exception 
{
	static void method(int x)
	{
		try {
			if(x < 0)
				throw new IllegalArgumentException();
			System.out.print("hello");
		}
		catch(IllegalArgumentException e)
		{
			System.out.print("IllegalArgumentException Caught: Value must be greater or equal to 0");
		}
	}

	public static void main(String[] args) 
	{
		method(-1);
	}

}
