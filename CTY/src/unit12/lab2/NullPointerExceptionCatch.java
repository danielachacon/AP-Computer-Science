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
		System.out.println("NullPointerExceptionCatch compares a given string with the word hello. It will throw NullPointerException when the given String is null");
		System.out.println("Test argument values:");
		
		
		NullPointerExceptionThrown test = new NullPointerExceptionThrown();
		try
		{
			System.out.println("\nPassing the value world");
			test.compare("world");
		}
		catch(NullPointerException e)
		{
			System.out.print("ERROR: s cannot be null!\nException: " + e);
		}
		
		try
		{
			System.out.println("\nPassing the value null");
			test.compare(null);
		}
		catch(NullPointerException e)
		{
			System.out.print("ERROR: s cannot be null!\nException: " + e);
		}

	}

}
