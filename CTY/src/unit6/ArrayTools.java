package unit6;

import java.util.Arrays;

public class ArrayTools {	//Check
	
	public static char minimum(char array[])
	{
		char minimum = array[0];
		
		for(int i = 1; i < array.length; i++) 
		{
			if(array[i] < minimum)
				minimum = array[i];
		}
		
		return minimum;
	}
	
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
	
	
	public static char maximum( char array[])
	{
		char maximum = 0;
		
		for(int i = 0; i < array.length; i++) 
		{
			if(array[i] > maximum)
				maximum = array[i];
		}
		
		return maximum;
	}
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
	
	
	public static int minimumAt(char array[])
	{
		char minimum = array[0];
		int place = 0;
		
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
	
	public static int maximumAt(char array[])
	{
		char maximum = 0;
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
	
	public static double average(int array[])
	{
		double average = 0;
		
		for(int i = 0; i < array.length; i++) 
			average += array[i];
		
		return average / array.length;
	}
	
	public static double average(double array[])
	{
		double average = 0;
		
		for(int i = 0; i < array.length; i++) 
			average += array[i];
		
		return average / array.length;
	}
}
