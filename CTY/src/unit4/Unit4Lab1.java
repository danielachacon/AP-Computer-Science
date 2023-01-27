package unit4;

import java.util.Scanner;

/**
 * This class asks a user to guess a number between 1 and a user-input number
 * with a user-input number of guesses. Then, it takes in user guesses and tells the user
 * if it is higher, lower, or correct. The user can play until the user specifies that it 
 * does not want to continue.
 * 
 * @author Daniel Achacon
 */

public class Unit4Lab1 {

	public static void main(String[] args) 
	{
		//Continues playing the game if true
		boolean playAgain = true;
		
		while(playAgain == true)
		{
			// Asks and receives the highest guessable number 
			System.out.print("Input your highest guessable number:  ");
			Scanner input = new Scanner( System.in );
			int N = input.nextInt();
		
			// Creates a random number in the range (1 to N)
			int randomNumber = (int) ( N * Math.random() ) + 1;
		
			// Gets the maximum number of guesses allowed
			System.out.print("\nWhat is the maximum amount of guesses: ");
			int maxGuess = input.nextInt();
		
			int guess;
			// Gets user guess, checks if it is too high, too low, or correct
			for(int i = 1; i <= maxGuess; i++)
			{
				//Gets user input
				System.out.print("\nGuess the number: ");
				guess = input.nextInt();
			
				//Checks user input
				if(guess > randomNumber)
					System.out.println("\n" + guess + " is too high");
				else if(guess < randomNumber)
					System.out.println("\n" + guess + " is too low");
				else if(guess == randomNumber)
				{
					System.out.print("\n" + guess + " is correct!");
					break;
				}
				System.out.println("You have used " + i + " attempts. You have " + (maxGuess - i) + " guesses left");
			}
		

			
			while(true)
			{
				//Sees if user wants to play again
				System.out.print("\nWould you like to play again (Yes or No): ");
				String Answer = input.next().toLowerCase();
				
				if(Answer.equals("yes") == true)
				{
					playAgain = true;
					break;
				}
				if(Answer.equals("no") == true)
				{
					playAgain = false;
					break;
				}
				else
					System.out.print("Input was not recognized. Please Try Again: ");
			}
		}
	}
}
