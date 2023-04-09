package unit12.lab2;

public class NullPointerExceptionThrown 
{
	public void NullPointerMethod(String s) throws NullPointerException
	{
		if(s.equals("hello"))	//S is null so NullPointerException is thrown
			System.out.print("No Exception Thrown!");
		else
			System.out.print("NullPointerException is thrown!");
	}
}
