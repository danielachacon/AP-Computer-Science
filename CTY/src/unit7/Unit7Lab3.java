package unit7;

import java.util.Scanner;

public class Unit7Lab3 //done
{
	static String[] sortWords(String a, String b, String c)
	{
		 String strings[] = new String[] {a.toLowerCase(), b.toLowerCase(), c.toLowerCase()};
		 int x, j = 0;
		 String z;
		 
		 for(int i = 1; i < 3; i++)
		 {
			 z = strings[i];
			 x = i - 1;
			 
			 while(x >= 0 && strings[x].substring(j, j+1).compareTo(z.substring(j, j+1)) >= 0)
			 {
				 if(strings[x].substring(j, j+1).compareTo(z.substring(j, j+1)) == 0)
					 j++;
				 else if(strings[x].substring(j, j+1).compareTo(z.substring(j, j+1)) > 0)
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
