package unit12.lab1;

public class DivideByZeroException extends Exception
{
	private int denom;
	
	public DivideByZeroException()
	{
		
	}
	
	public DivideByZeroException(String s)
	{
		super(s);
	}
	
	public DivideByZeroException(int d)
	{
		super("div by zero");
		denom = d;
	}
	
	public int getDenominator()
	{
		return denom;
	}
}
