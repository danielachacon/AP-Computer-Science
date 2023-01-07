package unit1;

/**
 * This class computers and displays the sum of two integers
 * using a static method called sum().
 * @author Daniel Achacon
 *
 */
public class Unit1Activity1 
{

	public static void main(String[] args) 
	{
		int firstValue = 10;
		int secondValue = 20;
		System.out.println( "The sum is " + sum( firstValue, secondValue ) );
	}
	
	/**
     *  @param first the first value
     *  @param second the second value
     *  @return the sum of first and second is returned
   */
   public static int sum( int first, int second )
   {
      return first + second;
   }

}
