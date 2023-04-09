package unit12.lab2;

public class IllegalArgumentExceptionThrown 
{

	public  void illegalMethod(int x)
	{
	
		if(x < 0)
			throw new IllegalArgumentException(Integer.toString(x));
		else
			x++;
	}
	
	public  void IllegalArgumentExceptionMethod(int x) 
	{
		this.illegalMethod(x);
	}

}
