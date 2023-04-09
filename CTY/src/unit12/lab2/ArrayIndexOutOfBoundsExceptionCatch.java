package unit12.lab2;
/*
 * ArrayIndexOutOfBoundsException - Runtime Exception.
 * Thrown when there is a request for a negative index or an index greater or equal to the size of an array
 */
public class ArrayIndexOutOfBoundsExceptionCatch {

	public static void main(String[] args) 
	{		
		int[] myArray = new int[10];
		ArrayIndexOutOfBoundsExceptionThrown test = new ArrayIndexOutOfBoundsExceptionThrown();
		try
		{
			test.ArrayIndexOutOfBoundsExceptionMethod(myArray, 10);	//Array index is 0-9
			System.out.print("Success!");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException Caught - 10 is outside the array's index.\nException : " + e);
		}
		try
		{
			test.ArrayIndexOutOfBoundsExceptionMethod(myArray, 15);		//Array index is 0-9
			System.out.print("Success!");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException Caught - 15 is outside the array's index.\nException : " + e);
		}
		try
		{
				//Index cannot be negative
			test.ArrayIndexOutOfBoundsExceptionMethod(myArray, -1);	
			System.out.print("Success!");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException Caught - -1 is outside the array's index.\nException : " + e);
		}
	}

}
