package unit12.lab2;

public class NullPointerExceptionThrown 
{
	public void compare(String s) throws NullPointerException
	{
		if(s.equals("hello"))	// s, when passed as null will throw a NullPointerException
			System.out.print("The value of s is equal to hello\n");
		else
			System.out.print("The given value " + s + " not equal to hello\n");
	}
}
