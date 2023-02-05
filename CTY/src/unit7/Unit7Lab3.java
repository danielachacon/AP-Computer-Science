package unit7;

import java.util.Scanner;

/**
 * This class receives 3 user input words then uses static function sortWords to 
 * sort the words in alphabetical order and then displays the words in alphabetical
 * order
 * 
 * @author Daniel Achacon
 */

public class Unit7Lab3 
{
	/**
	 * @param First Word
	 * @param Second Word
	 * @param Third Word
     * @return Array of Strings with the 3 words in alphabetical order
     */
	static String[] sortWords(String a, String b, String c)
	{
		 String strings[] = new String[] {a.toLowerCase(), b.toLowerCase(), c.toLowerCase()};	
		 int x, j = 0;
		 String z;
		 
		 for(int i = 1; i < 3; i++)
		 {
			 z = strings[i];
			 x = i - 1;
			 
			 while(x >= 0 && strings[x].substring(j, j+1).compareTo(z.substring(j, j+1)) >= 0)		// While the second string's first character >= first string's first character 
			 {	 																					//(array potentially is not in alphabetical order)
				 if(strings[x].substring(j, j+1).compareTo(z.substring(j, j+1)) == 0)	//If the same, Move to next character
					 j++;
				 else if(strings[x].substring(j, j+1).compareTo(z.substring(j, j+1)) > 0) // If not equal, then switch the position of the Strings so that they are in alphabetical order
				 {
					 strings[x + 1] = strings[x];
					 x--;
				 }
			 }
			 
			 strings[x + 1] = z;
			 
		 }
		 
		 return strings;		 
	}

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String strings[] = new String[3];
		String sorted[] = new String[3];
		
		for(int i = 0; i < 3; i++)
		{
			System.out.println("Enter Word " + (i + 1) + ": " );
			strings[i] = input.next();
		}
		
		sorted = sortWords(strings[0], strings[1], strings[2]);
		
		System.out.print("Order: " + sorted[0] + " " + sorted[1] + " " + sorted[2]);
	}

}
