package unit7;

public class StringCount {	//done
	
	static int characterCount(String word)
	{
		int count = 0;
		for(int i = 0; i < word.length(); i++)
		{
			if(word.charAt(i) >= 'a' && word.charAt(i) <= 'z')
				count++;
		}
		return count;
	}

	static int wordCount(String word)
	{
		int count = 0;
		
		if(word.charAt(count) >= 'a' && word.charAt(count) <= 'z')
			count++;
		
		for(int i = 0; i < word.length(); i++)
		{
			if(word.charAt(i) == ' ' && word.charAt(i + 1) >= 'a' && word.charAt(i + 1) <= 'z')
				count++;
		}
		
		return count;
	}
	
	public static void main(String[] args)
	{
		if(args.length < 3)
			System.out.print("ERROR/n/n Please input as: StringCount –[c][w] user_string \n");
		
		else if(args[0].equals("StringCount") && args[1].equals("-[c]"))
			System.out.print(" Word Count is: " + characterCount(args[2].toLowerCase()));
		
		else if(args[0].equals("StringCount") && args[1].equals("-[w]"))
			System.out.print("Character Count is: " + wordCount(args[2].toLowerCase()));
		
		else if(args[0].equals("StringCount") && args[1].equals("-[c][w]"))
			System.out.print("Character Count is: " + characterCount(args[2].toLowerCase())
							 + "\nWord Count is: " + wordCount(args[2].toLowerCase()));
		else
			System.out.print("ERROR\n\nPlease input as: StringCount –[c][w] user_string \n");
	}

}
