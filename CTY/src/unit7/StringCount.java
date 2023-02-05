package unit7;

/**
 * This class receives a string and command from the command line and 
 * depending on the command, it will use static functions characterCount 
 * and wordCount to count the amount of characters and words in a string respectively.
 * 
 * -[c] will count the characters, -[w] will count the words, 
 * -[c][w] will count both the words and characters
 * 
 * @author Daniel Achacon
 */


public class StringCount {	
	
	static int characterCount(String word)
	{
		int count = 0;
		for(int i = 0; i < word.length(); i++)
		{
			if(word.charAt(i) >= 'a' && word.charAt(i) <= 'z')	// Checks if character is in alphabet
				count++;
		}
		return count;
	}

	static int wordCount(String word)
	{
		int count = 0;
		
		if(word.charAt(count) >= 'a' && word.charAt(count) <= 'z')	//Checks if a first word exists
			count++;
		
		for(int i = 0; i < word.length(); i++)
		{
			if(word.charAt(i) == ' ' && word.charAt(i + 1) >= 'a' && word.charAt(i + 1) <= 'z')	//Checks if there is a word after a first word and space (ex: multiple   spaces   between  words)
				count++;
		}
		
		return count;
	}
	
	public static void main(String[] args)
	{
		if(args.length < 3)
			System.out.print("ERROR\n\nPlease input as: StringCount -[c][w] user_string \n");
		
		else if(args[0].equals("StringCount") && args[1].equals("-[c]"))						//Checks if input from command line reads ONLY [c]
			System.out.print("String is: " + args[2] + "\nWord Count is: " + characterCount(args[2].toLowerCase()));
		
		else if(args[0].equals("StringCount") && args[1].equals("-[w]"))						//Checks if input from command line reads ONLY [w]
			System.out.print("String is: " + args[2] + "\nCharacter Count is: " + wordCount(args[2].toLowerCase()));
		
		else if(args[0].equals("StringCount") && args[1].equals("-[c][w]"))						//Checks if input from command line reads ONLY [c][w]
			System.out.print("String is: " + args[2] + "\nCharacter Count is: " + characterCount(args[2].toLowerCase())
							 + "\nWord Count is: " + wordCount(args[2].toLowerCase()));
		else
			System.out.print("ERROR\n\nPlease input as: StringCount -[c][w] user_string \n");
	}

}
