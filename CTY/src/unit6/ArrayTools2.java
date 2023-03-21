package unit6;
import java.util.Arrays;

/**
 * This class stores methods which receive an array of characters/integers/doubles
 * and can compute the minimum, maximum, minimum/maximum positions, and averages of the array.
 * 
 * This class also stores methods which can search for certain values in the array and return its position, 
 * sort the array in ascending order, and can tell if two arrays are equal to each other.
 * 
 * @author Daniel Achacon
 */

public class ArrayTools2 
{
	/**
	 * @param array of characters
	 * @return minimum (smallest) element of the array
	 */
	public static char minimum(char array[])
	{
		char minimum = array[0];					//Predetermines first element as the temporary minimum
		
		for(int i = 1; i < array.length; i++) 	//Traverses through all elements after the first element and checks if it is less than the current minimum 
		{
			if(array[i] < minimum)			//Checks if current element is less than the current minimum 
				minimum = array[i];			//If less than the minimum, then the current element becomes the new minimum
		}
		
		return minimum;
	}
	
	/**
	 * @param array of integers
	 * @return minimum (smallest) element of the array
	 * 
	 * Uses same logic as method above
	 */
	public static int minimum(int array[])
	{
		int minimum = array[0];
		
		for(int i = 1; i < array.length; i++) 
		{
			if(array[i] < minimum)
				minimum = array[i];
		}
		
		return minimum;
	}
	
	/**
	 * @param array of doubles
	 * @return minimum (smallest) element of the array
	 * 
	 * Uses same logic as method above
	 */
	public static double minimum(double array[])
	{
		double minimum = array[0];
		
		for(int i = 1; i < array.length; i++) 
		{
			if(array[i] < minimum)
				minimum = array[i];
		}
		
		return minimum;
	}
	
	/*__________________________________________________________*/
	
	/**
	 * @param array of characters
	 * @return maximum (largest) element of the array
	 */
	public static char maximum( char array[])
	{
		char maximum = 0;					//Predetermines first element as the temporary maximum
		
		for(int i = 0; i < array.length; i++) //Traverses through all elements after the first element and checks if it is greater than the current maximum
		{
			if(array[i] > maximum)		//Checks if current element is greater than the current maximum 
				maximum = array[i];		//If greater than the maximum, then the current element becomes the new maximum
		}
		
		return maximum;
	}
	
	/**
	 * @param array of integers
	 * @return maximum (largest) element of the array
	 * 
	 * Uses same logic as method above
	 */
	public static int maximum( int array[])
	{
		int maximum = 0;
		
		for(int i = 0; i < array.length; i++) 
		{
			if(array[i] > maximum)
				maximum = array[i];
		}
		
		return maximum;
	}
	
	/**
	 * @param array of doubles
	 * @return maximum (largest) element of the array
	 * 
	 * Uses same logic as method above
	 */
	public static double maximum( double array[])
	{
		double maximum = 0;
		
		for(int i = 0; i < array.length; i++) 
		{
			if(array[i] > maximum)
				maximum = array[i];
		}
		
		return maximum;
	}
	
	/*__________________________________________________________*/
	
	/**
	 * @param array of characters
	 * @return position in array of the minimum (smallest) element of the array
	 */
	public static int minimumAt(char array[])	
	{
		char minimum = array[0]; //Predetermines first element as the temporary minimum
		int place = 0; //Stores position of the minimum
		
		for(int i = 1; i < array.length; i++) //Traverses through all elements after the first element and checks if it is less than the current minimum 
		{
			if(array[i] < minimum)	//Checks if current element is less than the current minimum  
			{
				place = (char) i;	//If less than the minimum, then the current element becomes the new minimum
				minimum = array[i];	//Position of minimum gets updated
			}
		}
		
		return place;
	}
	
	/**
	 * @param array of integers
	 * @return position in array of the minimum (smallest) element of the array
	 * 
	 * Uses same logic as the method above
	 */
	public static int minimumAt(int array[])
	{
		int minimum = array[0];
		int place = 0;
		
		for(int i = 1; i < array.length; i++) 
		{
			if(array[i] < minimum)
			{
				place = i;
				minimum = array[i];
			}
		}
		
		return place;
	}
	
	/**
	 * @param array of doubles
	 * @return position in array of the minimum (smallest) element of the array
	 * 
	 * Uses same logic as the method above
	 */
	public static int minimumAt(double array[])
	{
		double minimum = array[0];
		int place = 0;
		
		for(int i = 1; i < array.length; i++) 
		{
			if(array[i] < minimum)
			{
				place = i;
				minimum = array[i];
			}
		}
		
		return place;
	}

	/*__________________________________________________________*/
	
	/**
	 * @param array of characters
	 * @return position in array of the maximum (largest) element of the array
	 */
	public static int maximumAt(char array[])
	{
		char maximum = 0;	//Predetermines first element as the temporary maximum
		int place = 0;	//Stores position of the maximum
		
		for(int i = 0; i < array.length; i++) //Traverses through all elements after the first element and checks if it is greater than the current maximum
		{
			if(array[i] > maximum)	//Checks if current element is greater than the current maximum  
			{
				maximum = array[i];	//If greater than the maximum, then the current element becomes the new maximum
				place = i;			//Position of maximum gets updated
			}
		}
		
		return place;
	}
	
	/**
	 * @param array of doubles
	 * @return position in array of the maximum (largest) element of the array
	 * 
	 * Uses the same logic as the method above
	 */
	public static int maximumAt(double array[])
	{
		double maximum = 0;
		int place = 0;
		
		for(int i = 0; i < array.length; i++) 
		{
			if(array[i] > maximum)
			{
				maximum = array[i];
				place = i;
			}
		}
		
		return place;
	}
	
	/**
	 * @param array of integers
	 * @return position in array of the maximum (largest) element of the array
	 * 
	 * Uses the same logic as the method above
	 */
	public static int maximumAt(int array[])
	{
		int maximum = 0;
		int place = 0;
		
		for(int i = 0; i < array.length; i++) 
		{
			if(array[i] > maximum)
			{
				maximum = array[i];
				place = i;
			}
		}
		
		return place;
	}
	
	
	/*__________________________________________________________*/
	
	/**
	 * @param array of integers
	 * @return average of all elements of the array
	 */
	public static double average(int array[])
	{
		double average = 0;
		
		for(int i = 0; i < array.length; i++) // Adds all the elements of the array and stores it in average
			average += array[i];
		
		return average / array.length;		//Divides the sum by the amount of elements in the array to return the average
	}
	
	/**
	 * @param array of doubles
	 * @return average of all elements of the array
	 * 
	 * Uses the same logic as the method above
	 */
	public static double average(double array[])
	{
		double average = 0;
		
		for(int i = 0; i < array.length; i++) 
			average += array[i];
		
		return average / array.length;
	}
	
	/*__________________________________________________________*/
	
	/**
	 * @param array of characters
	 * @param array of characters
	 * @return boolean (TRUE/FALSE) for if the two arrays are equal to each other
	 */
	public boolean equals( char a1[], char a2[] )
	{
		if(Arrays.equals(a1,a2)  == true)		//Calls Arrays.equals method which compares the two arrays and sees if they are equal. If they are, return true. If not, return false.
			return true;
		else
			return false;
	}
	/**
	 * @param array of integers
	 * @param array of integers
	 * @return boolean (TRUE/FALSE) for if the two arrays are equal to each other
	 * 
	 * Uses same logic as method above
	 */
	public boolean equals( int a1[], int a2[] )
	{
		if(Arrays.equals(a1,a2)  == true)
			return true;
		else
			return false;
	}
	/**
	 * @param array of doubles
	 * @param array of doubles
	 * @return boolean (TRUE/FALSE) for if the two arrays are equal to each other
	 * 
	 * Uses same logic as method above
	 */
	public boolean equals( double a1[], double a2[] )
	{
		if(Arrays.equals(a1,a2)  == true)
			return true;
		else
			return false;
	}
	
	/*__________________________________________________________*/
	/**
	 * @param array of characters
	 * @param character key to search for in element
	 * @return position of the key element in array, returns negative value if none
	 */
	public int find(char array[], char key)
	{
		return Arrays.binarySearch(array,key);	//Calls Arrays.binarysearch method to find the position of the key in the array
		
	}
	
	/**
	 * @param array of integers
	 * @param integer key to search for in element
	 * @return position of the key element in array, returns negative value if none
	 * 
	 * Uses same logic as method above
	 */
	public int find(int array[], int key)
	{
		return Arrays.binarySearch(array,key);
	}
	
	/**
	 * @param array of doubles
	 * @param double key to search for in element
	 * @return position of the key element in array, returns negative value if none
	 * 
	 * Uses same logic as method above
	 */
	public int find(double array[], double key)
	{
		return Arrays.binarySearch(array,key);
	}
	/*__________________________________________________________*/
	/**
	 * @param array of characters
	 * @return array of characters sorted in ascending order
	 */
	public char[] sort(char array[])
	{
		Arrays.sort(array);	//Calls Arrays.sort method to sort array in ascending order then returns the array
		return array;
	}
	
	/**
	 * @param array of integers
	 * @return array of integers sorted in ascending order
	 * 
	 * Uses same logic as method above
	 */
	public int[] sort( int array[] )
	{
		Arrays.sort(array);
		return array;
	}
	
	/**
	 * @param array of doubles
	 * @return array of doubles sorted in ascending order
	 * 
	 * Uses same logic as method above
	 */
	public double[] sort( double array[] )
	{
		Arrays.sort(array);
		return array;
	}

}
