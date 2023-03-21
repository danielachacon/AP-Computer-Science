package unit6;

import java.util.Arrays;

/**
 * This class stores methods which receive an array of characters/integers/doubles
 * and can compute the minimum, maximum, minimum/maximum positions, and averages of the array.
 * 
 * @author Daniel Achacon
 */

public class ArrayTools {	//Check
	
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
}
