package unit12.lab2;

public class IllegalArgumentExceptionThrown 
{

	/**
	 * Preconditions: x must be an integer that is >= 0
	 * Postconditions: x++ or an exception is thrown
	 * @param x
	 * @return x++
	 */
	public  int increment(int x)
	{
	
		if(x < 0)
			throw new IllegalArgumentException(Integer.toString(x));
		else
			return x++;
	}

}
