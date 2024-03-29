package unit15;

/**
 * This method uses the bubble sort algorithm to sort an array of integers
 * @author Daniel Achacon
 */

public class BubbleSort 
{
	/**
	 * Preconditions: array is any array of integers
	 * Postconditions: array will be sorted by increasing value
	 * 
	 * Bubble sort is O(n^2) because at worst case scenario, the inner loop does O(n) work on each iteration and the outer loop runs for O(n) iterations, making the total work O(n^2)
	 * @param array
	 */
	static void bubbleSort(int[] array)
	{
		for(int i = 0; i < array.length - 1; i++)	//i is used to find the largest unsorted index 
		{
			for(int j = 0; j < array.length - i - 1; j++)	//array.length - i - 1 because every iteration of i sorts the next largest element of the array
			{												// So this is only sorting through everything that is unsorted 
				if(array[j] > array[j + 1])	//If the values are in descending order
				{
					int temp = array[j];	//Swap so that they are in ascending order
					array[j] = array[j + 1];
					array[j + 1] = temp;
				} 
			}
				
		}
	}
	
	public static void main(String[] args)
	{
		int array[] = {2,1,3,10,6,5,7,9,8,4};
		System.out.print("Array: " );
		for(int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		bubbleSort(array);
		System.out.print("\nArray Sorted: " );
		for(int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
			
	}

}
