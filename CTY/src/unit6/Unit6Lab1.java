package unit6;

import java.util.Scanner;

/**
 * This class receives a set of 10 integers and then calculate the amount of occurrences
 * for each distinct integer in that set
 * 
 * @author Daniel Achacon
 */

public class Unit6Lab1 // Done
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int y;
		
		System.out.print("Enter how much integers to input: ");
		y = input.nextInt();
		
		int x[] = new int[y];
		int z[] = new int[50];
		
		System.out.print("Enter " + y + " integers in 1-50 range: ");
		
		for(int i = 0; i < y; i++)
		{
			x[i] = input.nextInt();
			z[x[i]]++;	//Counts amount of occurrences for distinct integers
		}
		
		//prints results: amount of occurrences
		for(int i = 0; i < 10; i++)
		{
			if(z[x[i]] > 0)
			{
				System.out.println(x[i] + " occurs " + z[x[i]] + " times");
				z[x[i]] = 0;
			}
		}

				
	}
}
