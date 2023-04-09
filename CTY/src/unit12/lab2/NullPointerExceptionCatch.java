package unit12.lab2;

/*
 * NullPointerException - Runtime Exception
 * Thrown when the program attempts to use an object reference that has the null value. The null indicates that there is no value assigned to a reference variable.
 * 
 * This exception can be thrown under the following conditions:
 * Invoking a method from a null object.
 * Accessing or modifying a null object’s field.
 * Taking the length of null, as if it were an array.
 * Accessing or modifying the slots of null object, as if it were an array.
 * Throwing null, as if it were a Throwable value.
 * When you try to synchronize over a null object.
 */

public class NullPointerExceptionCatch {

	public static void main(String[] args) 
	{
		// example 1: invoking a method of a null object
		String s = null;
		NullPointerExceptionThrown test = new NullPointerExceptionThrown();
		try
		{
			test.NullPointerMethod(s);
		}
		catch(NullPointerException e)
		{
			System.out.print("s cannot be null! Exception: " + e);
		}

	}

}
