package unit12.lab2;

public class ArrayIndexOutOfBoundsExceptionThrown 
{
	int[] arr;
	int maxSize = 0;
	
	

	public ArrayIndexOutOfBoundsExceptionThrown(int maxSize) {
		super();	
		this.maxSize = maxSize;
		this.arr = new int[maxSize];
		
		System.out.print("Initializing content of an array with maxSize = " + maxSize + "\n");
		for (int i=0; i< maxSize; i++) 
			this.arr[i] = i+1;
	}


	/**
	 * Preconditions: index is an integer > 0
	 * Postconditions: Array is printed or exception is thrown
	 * @param index
	 */
	public void ArrayIndexOutOfBoundsExceptionMethod(int index) throws ArrayIndexOutOfBoundsException
	{
		arr[index] = 100;	// assign 100 to the array index-th element
		System.out.print("Assigning arr[" + index + "] with value 100");
	}

}
