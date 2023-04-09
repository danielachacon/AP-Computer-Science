package unit12.lab2;

public class ArrayIndexOutOfBoundsExceptionThrown 
{
	public void ArrayIndexOutOfBoundsExceptionMethod(int[] myArray,  int index) throws ArrayIndexOutOfBoundsException
	{
		myArray[index] = 10;	//Array index is 0-9
		System.out.print("Success!");
	}

}
