package unit6;

import java.util.Arrays;

public class ArrayTools {	//Check
	
	static char minimum(char array[])
	{
		char minimum = array[0];
		
		for(int i = 1; i < array.length; i++) 
		{
			if(array[i] < minimum)
				minimum = array[i];
		}
		
		return minimum;
	}
	
	static int minimum(int array[])
	{
		int minimum = array[0];
		
		for(int i = 1; i < array.length; i++) 
		{
			if(array[i] < minimum)
				minimum = array[i];
		}
		
		return minimum;
	}
	
	static double minimum(double array[])
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
	
	
	static char maximum( char array[])
	{
		char maximum = 0;
		
		for(int i = 0; i < array.length; i++) 
		{
			if(array[i] > maximum)
				maximum = array[i];
		}
		
		return maximum;
	}
	static int maximum( int array[])
	{
		int maximum = 0;
		
		for(int i = 0; i < array.length; i++) 
		{
			if(array[i] > maximum)
				maximum = array[i];
		}
		
		return maximum;
	}
	
	static double maximum( double array[])
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
	
	
	static char minimumAt(char array[])
	{
		char minimum = array[0];
		char place = 0;
		
		for(int i = 1; i < array.length; i++) 
		{
			if(array[i] < minimum)
			{
				place = (char) i;
				minimum = array[i];
			}
		}
		
		return place;
	}
	static int minimumAt(int array[])
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
	static double minimumAt(double array[])
	{
		double minimum = array[0];
		double place = 0;
		
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
	
	static char maximumAt(char array[])
	{
		char maximum = 0;
		char place = 0;
		
		for(int i = 0; i < array.length; i++) 
		{
			if(array[i] > maximum)
			{
				maximum = array[i];
				place = (char) i;
			}
		}
		
		return place;
	}
	static double maximumAt(double array[])
	{
		double maximum = 0;
		double place = 0;
		
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
	static int maximumAt(int array[])
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
	
	static double average(int array[])
	{
		int average = 0;
		
		for(int i = 0; i < array.length; i++) 
			average += array[i];
		
		return average / array.length;
	}
	
	static double average(double array[])
	{
		double average = 0;
		
		for(int i = 0; i < array.length; i++) 
			average += array[i];
		
		return average / array.length;
	}
	
	/*__________________________________________________________*/
	
	boolean equals( char a1[], char a2[] )
	{
		if(Arrays.equals(a1,a2)  == true)
			return true;
		else
			return false;
	}
	boolean equals( int a1[], int a2[] )
	{
		if(Arrays.equals(a1,a2)  == true)
			return true;
		else
			return false;
	}
	boolean equals( double a1[], double a2[] )
	{
		if(Arrays.equals(a1,a2)  == true)
			return true;
		else
			return false;
	}
	
	/*__________________________________________________________*/
	
	int find(char array[], char key)
	{
		return Arrays.binarySearch(array,key);
		
	}
	int find(int array[], int key)
	{
		return Arrays.binarySearch(array,key);
	}
	int find(double array[], double key)
	{
		return Arrays.binarySearch(array,key);
	}
	/*__________________________________________________________*/
	
	char[] sort(char array[])
	{
		Arrays.sort(array);
		return array;
	}
	int[] sort( int array[] )
	{
		Arrays.sort(array);
		return array;
	}
	double[] sort( double array[] )
	{
		Arrays.sort(array);
		return array;
	}
	/*__________________________________________________________*/

	static void arrayToolsTest()
	{
		
	}
	public static void main(String[] args)
	{
		
		

	}

}
