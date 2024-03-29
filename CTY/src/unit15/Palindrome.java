package unit15;

/**
 * This class checks whether a string is a palindrome or not (Not case sensitive)
 * @author Daniel Achacon
 *
 */
public class Palindrome 
{
	/**'
	 * Wrapper Function
	 * Preconditions: s must be a string
	 * Postconditions: Will always return true or false
	 * 
	 * @param s
	 * @return Whether the string is a palindrome as a Boolean
	 * 
	 */
	public static Boolean testPalindrome(String s)
	{
		char[] c = new char[s.length()];
		c = s.toLowerCase().toCharArray();
		
		return testPalindrome(c, 0, c.length - 1);
	}
	
	/***
	 * Palindromes are words that are the same forwards and backwards
	 * This method starts from the first and last index and iterates towards the opposite ends of the array 
	 * and every iteration it sees if the pair of indexes holds the same character
	 * 
	 * Preconditions: letters of the alphabet must be lowercase and i must start at 0 and will always be >= 0
	 * Postconditions: Will always return true or false
	 * @param c
	 * @param i
	 * @param j
	 * @return	Whether the string is a palindrome as a Boolean
	 */
	public static Boolean testPalindrome(char[] c, int i, int j)
	{
		if(i >= j)	//If the indexes are the same or past each other, then the pair of indexes have already been checked and are the same so it is a palindrome
			 return true;
		else if(c[i] < 'a' || c[i] > 'z')
			return testPalindrome(c,++i, j);
		else if(c[j] < 'a' || c[j] > 'z')	//Checks for anything noncharacter (ex: punctuation, colons, spaces)
			return testPalindrome(c, i, --j);
		else if(c[i] != c[j])	//If the character at the two indexes don't match up, then the String cannot be a palindrome
			return false;
		
		return testPalindrome(c,++i, --j);	//Call the function again and move the indexes one step towards their respective opposite end of the array
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Is \"A man a plan a canal: Panama!\" a Palindrome?: " + testPalindrome("A man a plan a canal: Panama!"));
		System.out.println("Is \"radar\" a Palindrome?: " + testPalindrome("radar"));
		System.out.println("Is \"max\" a Palindrome?: " + testPalindrome("max"));
	}
}
