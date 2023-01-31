package unit5;

import java.util.Scanner;

/**
 * This class receives a financial function to use, then uses static functions 
 * futureValueOfASingleSum, presentValueOfASingleSum, and futureValueOfAnAnnuity to calculate
 * then prints the value out. 
 * 
 * The interest compounds monthly and rounds money to the nearest penny
 * 
 * @author Daniel Achacon
 */

public class Unit5Lab1 {	

	/**
	 * @param p = initial value
     * @param n = amount of years
     * @param i = interest rate
     * @return future value after interest
	 */
	static double futureValueOfASingleSum(int p, int n, double i)
	{
		return Math.round(p * Math.pow((1 + i/12), n*12) * 100.0)/100.0;
	}
	
	/**
	 * @param f = future value
     * @param n = years
     * @return initial value before interest
	 */
	
	static double presentValueOfASingleSum(int f, int n, double i)
	{
		return Math.round(f/Math.pow((1 + i/12),n*12) * 100.0)/100.0;
	}
	
	/**
	 * @param a = amount monthly deposited
     * @param n = years
     * @param i = interest rate
     * @return Future value of an Annuity
	 */
	
	static double futureValueOfAnAnnuity(int a, int n, double i)
	{
		return Math.round((a * ((Math.pow((1+i/12),n*12) - 1)/(i/12))) * 100.0)/100.0;
	}
	
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int a, x, p, f, n;
		double i;
		double answer = 0;
		
		System.out.println("1. Future Value of a Single Sum\n" + 
						   "2. Present Value of a Single Sum\n" + 
						   "3. Future Value of an Annuity\n" +
						   "\nSpecify a financial function: ");
		
		x = input.nextInt();	// Receive choice for function
		
		System.out.println("Enter interest rate (ex: 5 = 5%): ");
		i = input.nextDouble()/100;	// Receive interest rate
		 
		switch(x)
		{
		case 1:
			System.out.println("Enter deposited dollars: ");
			p = input.nextInt();
			System.out.println("Enter amount of years: ");
			n = input.nextInt();
			answer = futureValueOfASingleSum(p,n,i);
			break;
		case 2:
			System.out.println("Enter final amount of dollars: ");
			f = input.nextInt();
			System.out.println("Enter amount of years: ");
			n = input.nextInt();
			answer = presentValueOfASingleSum(f,n,i);
			break;
		case 3:
			System.out.println("Enter dollars deposited monthly: ");
			a = input.nextInt();
			System.out.println("Enter amount of years: ");
			n = input.nextInt();
			answer = futureValueOfAnAnnuity(a,n,i);
			break;
		}
		
		System.out.println("Answer: $" + answer);
	}

}
