package unit6;

public class ArrayToolsTest2 
{
	public static void main(String[] args)
	{
		int[] intArray = {6,5,9,8,7,10};
		int[] intArray2 = {5,6,7,8,9,10};
		char[] charArray = {'c','d','e','a','b'};
		char[] charArray2 = {'a','b','c','d','e'};
		double[] doubleArray = {4.4,5.5,3.3,1.1,2.2};
		double[] doubleArray2 = {1.1,2.2,3.3,4.4,5.5};
		
		System.out.println("Equals Itself?: " + ArrayTools2.equals(charArray, charArray) + ", " + ArrayTools2.equals(intArray, intArray) + ", " + ArrayTools2.equals(doubleArray,doubleArray));
		System.out.println("Equals Other?: " + ArrayTools2.equals(charArray, charArray2) + ", " + ArrayTools2.equals(intArray, intArray2) + ", " + ArrayTools2.equals(doubleArray,doubleArray2));
		

		
		System.out.println("Find: " + ArrayTools2.find(charArray, 'a') + ", " + ArrayTools2.find(intArray, 5) + ", " + ArrayTools2.find(doubleArray,2.2));
		System.out.println("Find (not in array value): " + ArrayTools2.find(charArray, 'z') + ", " + ArrayTools2.find(intArray, 122) + ", " + ArrayTools2.find(doubleArray,12));
		
		ArrayTools2.sort(intArray);
		ArrayTools2.sort(charArray);
		ArrayTools2.sort(doubleArray);
		
		for(int i = 0; i < intArray.length; i++)
			System.out.print(intArray[i] + " ");
		System.out.println();
		for(int i = 0; i < charArray.length; i++)
			System.out.print(charArray[i] + " ");
		System.out.println();
		for(int i = 0; i < doubleArray.length; i++)
			System.out.print(doubleArray[i] + " ");
		System.out.println();
	}

}
