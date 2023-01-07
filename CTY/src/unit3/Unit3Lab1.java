package unit3;

import java.util.Scanner;

/**
 * This class takes in 3 values, displays them, and checks if they form an isosceles, scalene, equilateral, or no triangle
 * @author neilp
 *
 */

public class Unit3Lab1
{
	/**
	 * Uses Scanner to take in 3 integers, Uses if to check the type of triangles
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int side1 = 0;
		int side2 = 0;
		int side3 = 0;
		
		Scanner input = new Scanner( System.in );
		System.out.print("Enter 3 integers separated by a blank space: ");
		
		//Takes in 3 values
		side1 = input.nextInt();	
		side2 = input.nextInt();
		side3 = input.nextInt();
		
		//Prints the 3 values taken in
		System.out.printf("Side 1: %d\nSide 2: %d\nSide 3: %d\n", side1, side2, side3);
		
		//Checks for triangle type, then prints the type
		if(side1 == 0 || side2 == 0 || side3 == 0)
			System.out.print("The values entered do not make a valid triangle");
		else if(side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2)
			System.out.print("The values entered do not make a valid triangle");
		else if(side1 == side2 && side2 == side3)
			System.out.print("Equilateral Triangle");
		else if(side1 == side3 && side2 != side3)
			System.out.print("Isosceles Triangle");
		else if(side2 == side1 && side1 != side3)
			System.out.print("Isosceles Triangle");
		else if(side3 == side2 && side3 != side1)
			System.out.print("Isosceles Triangle");
		else if(side3 != side2 && side3 != side1 && side1 != side2)
			System.out.print("Scalene Triangle");

	}

}
