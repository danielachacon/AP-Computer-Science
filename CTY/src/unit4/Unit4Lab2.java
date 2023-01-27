package unit4;

import java.util.Scanner;

/**
 * This class asks the user to input a maximum amount of asterisks printed.
 * It will then take in the value, then print the maximum amount of asterisks, then
 * goes to the next line then prints x - 1 amount of asterisks. This repeats until the number
 * of asterisks is 0.
 * 
 * @author Daniel Achacon
 */

public class Unit4Lab2 {

	public static void main(String[] args) 
	{
		//Gets the amount of lines needed to print
		System.out.print("Enter the amount of astericks: ");
		Scanner input = new Scanner( System.in );
		int amount = input.nextInt();

		//Prints the Asterisks
		for(int i = 0; i < amount; i++)
		{
			//Prints every new line
			System.out.println();
			//Prints the asterisks needed on 1 line
			for(int j = 0; j < amount - i; j++)
				System.out.print("*");
		}
	}

}
