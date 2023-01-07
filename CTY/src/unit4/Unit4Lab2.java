package unit4;

import java.util.Scanner;

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
