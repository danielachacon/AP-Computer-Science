package unit6;

public class ArrayToolsTest 
{	
	public static void main(String[] args)
	{
		int[] intArray = {6,5,9,8,7,10};
		char[] charArray = {'c','d','e','a','b'};
		double[] doubleArray = {4.4,5.5,3.3,1.1,2.2};
		
		System.out.println("Minimum: " + ArrayTools.minimum(charArray) + ", " + ArrayTools.minimum(intArray) + ", " + ArrayTools.minimum(doubleArray));
		System.out.println("Maximum: " + ArrayTools.maximum(charArray) + ", " + ArrayTools.maximum(intArray) + ", " + ArrayTools.maximum(doubleArray));
		System.out.println("Minimum at: " + ArrayTools.minimumAt(charArray) + ", " + ArrayTools.minimumAt(intArray) + ", " + ArrayTools.minimumAt(doubleArray));
		System.out.println("Maximum at: " + ArrayTools.maximumAt(charArray) + ", " + ArrayTools.maximumAt(intArray) + ", " + ArrayTools.maximumAt(doubleArray));
		System.out.println("average: " + ArrayTools.average(intArray) + ", " + ArrayTools.average(doubleArray));
	}
}
