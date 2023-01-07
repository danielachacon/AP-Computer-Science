package unit5;

import java.util.Scanner;

public class Unit5Lab1 {	//done

	static double futureValueOfASingleSum(int p, int n, double i)
	{
		return Math.round(p * Math.pow((1 + i/12), n*12) * 100.0)/100.0;
	}
	
	static double presentValueOfASingleSum(int f, int n, double i)
	{
		return Math.round(f/Math.pow((1 + i/12),n*12) * 100.0)/100.0;
	}
	
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
		
		x = input.nextInt();
		
		System.out.println("Enter interest rate (ex: 5 = 5%): ");
		i = input.nextDouble()/100;
		
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
