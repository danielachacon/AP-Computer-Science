package unit2;

import java.util.Scanner;

public class Unit2Lab2 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner( System.in );
		System.out.print( "Enter monetary amount: " );
		
		double x = input.nextDouble();
		
		int dollar = (int) x;
		double cents = (x - dollar) * 100;
		double newCents = cents;
		
		int quarter = 0;
		int dime = 0;
		int nickel = 0;
		
		while(newCents >= 25)
		{
			newCents = newCents - 25;
			quarter++;
		}
		
		while(newCents >= 10)
		{
			newCents = newCents - 10;
			dime++;
		}
		
		while(newCents >= 5)
		{
			newCents = newCents - 5;
			nickel++;
		}
		
		int penny = (int) newCents;
		
		System.out.printf("$%.2f consists of %d dollars %d quarters %d dimes %d nickels %d pennies.", x, dollar, quarter, dime, nickel, penny);

	}

}
