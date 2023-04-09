package unit12.lab2;

/*
 * ClassCastException - Runtime Exception
 * Thrown to indicate that the code has attempted to cast an object to a subclass of which it is not an instance
 * or when the code tried to cast an object of one class to another class type that does not have any relationship between them.
 */

public class ClassCastExceptionCatch {

	public static void main(String[] args)
	{
		try
		{
			ClassCastExceptionThrown test = new ClassCastExceptionThrown();
			test.ClassCastExceptionMethod();
			System.out.print("It Works!");
		}
		catch(ClassCastException e)
		{
			System.out.print("Parent cannot be cast to Child!\nException : " + e);
		}

	}

}
