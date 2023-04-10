package unit12.lab2;
/*
 * ArrayIndexOutOfBoundsException - Runtime Exception.
 * Thrown when there is a request for a negative index or an index greater or equal to the size of an array
 */
public class ArrayIndexOutOfBoundsExceptionCatch {

	public static void main(String[] args) 
	{		
		int maxSize = 5;
		
		System.out.println("Sample Scenarios for catching ArrayIndexOutOfBoundsException\n");
			
				
		ArrayIndexOutOfBoundsExceptionThrown test = new ArrayIndexOutOfBoundsExceptionThrown(maxSize);
		try
		{
			System.out.println("\nAccessing array index 10 : ");
			test.ArrayIndexOutOfBoundsExceptionMethod(10);	// 10 > maxSize, will throw ArrayIndexOutOfBoundsException 
			System.out.println("Success!");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Result: 10 > maxSize (5), catch ArrayIndexOutOfBoundsException.\nException : " + e);
		}
		
		try
		{
			System.out.println("\nAccessing  array index -1 : ");
			test.ArrayIndexOutOfBoundsExceptionMethod(-1);	// -1 is not a valid array index, will throw ArrayIndexOutOfBoundsException	
			System.out.print("Success!");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Result: -1 is not a valid array index, catch ArrayIndexOutOfBoundsException.\nException : " + e);
		}
		
	}

}
