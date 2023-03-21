package unit6;
import java.util.Arrays;
public class ArrayTools2 
{
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
	
	
	public static char minimumAt(char array[])
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
	
	public static double minimumAt(double array[])
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
	
	public static char maximumAt(char array[])
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
	
	public static double maximumAt(double array[])
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
		int average = 0;
		
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
	
	/*__________________________________________________________*/
	
	public boolean equals( char a1[], char a2[] )
	{
		if(Arrays.equals(a1,a2)  == true)
			return true;
		else
			return false;
	}
	public boolean equals( int a1[], int a2[] )
	{
		if(Arrays.equals(a1,a2)  == true)
			return true;
		else
			return false;
	}
	public boolean equals( double a1[], double a2[] )
	{
		if(Arrays.equals(a1,a2)  == true)
			return true;
		else
			return false;
	}
	
	/*__________________________________________________________*/
	
	public int find(char array[], char key)
	{
		return Arrays.binarySearch(array,key);
		
	}
	
	public int find(int array[], int key)
	{
		return Arrays.binarySearch(array,key);
	}
	
	public int find(double array[], double key)
	{
		return Arrays.binarySearch(array,key);
	}
	/*__________________________________________________________*/
	
	public char[] sort(char array[])
	{
		Arrays.sort(array);
		return array;
	}
	
	public int[] sort( int array[] )
	{
		Arrays.sort(array);
		return array;
	}
	
	public double[] sort( double array[] )
	{
		Arrays.sort(array);
		return array;
	}
	/*__________________________________________________________*/



}
