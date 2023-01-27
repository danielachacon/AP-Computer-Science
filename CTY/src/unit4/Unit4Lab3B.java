package unit4;

import java.util.Scanner;

/**
 * This class receives uses a for loop to receive a set of 10 user-input integers 
 * and then determines the largest and smallest integers. 
 * 
 * @author Daniel Achacon
 */

public class Unit4Lab3B{

	public static void main(String[] args) 
	{
		int counter;
		int number;
		int smallest;
		int largest = 0;
		
		//Gets First Number and stores it into smallest
		System.out.print("Input a number:  ");
		Scanner input = new Scanner( System.in );
		smallest = input.nextInt();
		
		//Gets numbers and compares it to the previous number to see if it is greatest or least
		for(counter = 1; counter < 10; counter++)
		{
			System.out.print("Input a number:  ");
			number = input.nextInt();
			
			if(number > largest)
				largest = number;
			else if(number < smallest)
				smallest = number;
		}
		
		System.out.print("\nLargest Number: " + largest);
		System.out.print("\nSmallest Number: " + smallest);
	}
}
