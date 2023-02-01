package unit4;

import java.util.Scanner;

/**
 * This class gives a certain amount of multiplication questions to be answered, 
 * checks if the input answer is correct, displays the correct answer when wrong,
 * and counts the percentage of correct answer and time taken to answer the questions.
 * 
 * @author Daniel Achacon
 */

public class Unit4Activity1 
{
	public static void main ( String [] args )
	{
		long startTime, stopTime;
		
		// Generate 2 random numbers that will be multiplied
		int number1 = (int) ( Math.random() * 10 );
		int number2 = (int) ( Math.random() * 10 );
		
		// Total score
		int total = 0;
		
		// Asks for the amount of problems
		System.out.print("How many multiplication problems? ");
		Scanner input = new Scanner( System.in );
		int problemAmount = input.nextInt();
		
		//Starts time check and gives problems
		startTime = System.currentTimeMillis();
		for(int i = 0; i < problemAmount; i++)
		{
			// Prompt user to input answer
			System.out.print( "\nWhat is " + number1 + " * " + number2 + "? " );
			Scanner input2 = new Scanner( System.in );
			int answer = input2.nextInt();
		
			// Grade the answer
			if ((number1 * number2) == answer) 
			{
				System.out.println( "Congratulations you are correct!" ); 
				total++;
			}
			else
				System.out.println( "You are incorrect. The correct answer is " + (number1 * number2));
			
			// Generate 2 new random numbers that will be multiplied
			number1 = (int) ( Math.random() * 10 );
			number2 = (int) ( Math.random() * 10 );
		}
		
		//Records stop time
		stopTime = System.currentTimeMillis();
		
		//Displays final
		System.out.println("\nYour total score is: " + total + " and the percentage of questions you answered correctly is " + ((float) total/problemAmount * 100) + "%.");
		System.out.println("The time it took to solve these problems was " + ((stopTime - startTime) / 1000) + " seconds");

	}
}
