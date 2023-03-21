package unit5;

import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
// 1a) 2 constants - e and pi.
// 1b) 55
// 1c) 26
// 1d) 11

public class Unit5Activity1 {

	public static void main(String[] args)
	{
		//2. Degrees to Radians, Sin, Cos, Tan
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an Angle in Degrees: ");
		double angle = input.nextDouble();
		
		System.out.println("Angle in Degrees: " + angle
							+ "\nAngle in Radians " + Math.round(angle * Math.PI/180 * 1000.0) / 1000.0
							+ "\nSine of Angle " + Math.round(Math.sin(Math.toRadians(angle)) * 1000.0) / 1000.0
							+ "\nCosine of Angle " + Math.round(Math.cos(Math.toRadians(angle)) * 1000.0) / 1000.0
							+ "\nTangent of Angle " + Math.round(Math.tan(Math.toRadians(angle)) * 1000.0) / 1000.0);
		
		System.out.println();
		
		//3. Random int 20 times from 1-5
		//3a) The sequences of numbers each time were different
		//3b) When random is first called each run, it creates a single new pseudorandom-number generator.
		//	  This causes it to different each time.
		for(int i = 0; i < 20; i++)	//Displays 20 different random integers ranging from 1-5
			System.out.print((int) (Math.random() * 5) + 1 + " ");
		
		System.out.println();
		
		//4. Random int 100 times using Random Class and count occurrences
		
		Random rand = new Random(1);	//Same seed (1) each time leads to the same numbers generated each time
		int number;
		int count = 0;
		int array[] = new int[23];	//Stores occurrences of each element of the set {6,10,14,18,22}
		
		while(count < 100)	//Repeat until we get 100 total occurrences of the set {6,10,14,18,22}.
		{
			number = rand.nextInt(23);
			switch(number)
			{
			case 6:
				array[6]++; //Adds to the amount of occurrences for the specific number
				System.out.print(number + " ");	//Prints the number generated
				count++;	//Adds to the total amount of occurrences of all numbers in the set {6,10,14,18,22}
				break;
			case 10:
				array[10]++;
				System.out.print(number + " ");
				count++;
				break;
			case 14:
				array[14]++;
				System.out.print(number + " ");
				count++;
				break;
			case 18:
				array[18]++;
				System.out.print(number + " ");
				count++;
				break;
			case 22:
				array[22]++;
				System.out.print(number + " ");
				count++;
				break;
			}
			
		}
		
		System.out.println("\nOccurrences:\n"
							+ "6: " + array[6]
							+ "\n10: " + array[10]
							+ "\n14: " + array[14]
							+ "\n18: " + array[18]
							+ "\n22: " + array[22]);
		
		System.out.println();
		
		//5. Round
		double x, y;
		System.out.println("Enter a number: ");
		x = input.nextDouble();
		System.out.println("Enter a number: ");
		y = input.nextDouble();
		System.out.println((int) (Math.floor((x/y) * Math.pow(10,0) + 0.5) / Math.pow(10, 0)));
		System.out.println(Math.floor((x/y) * Math.pow(10,1) + 0.5) / Math.pow(10, 1));
		System.out.println(Math.floor((x/y) * Math.pow(10,2) + 0.5) / Math.pow(10, 2));
		System.out.println(Math.floor((x/y) * Math.pow(10,3) + 0.5) / Math.pow(10, 3));
	}

}
