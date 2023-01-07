package unit5;

import java.util.Scanner;

public class Unit5Lab3 {
	
	static double minimum(double a, double b, double c)
	{		
		return Math.min(a, Math.min(b,c));
	}
	
	static double maximum(double a, double b, double c)
	{	
		return Math.max(a, Math.max(b, c));
	}
	
	static double gradeMin(double a, double b, double c, double d)
	{
		return Math.max(Math.max(a,b), Math.max(c, d));
	}
	static double gradeMax(double a, double b, double c, double d)
	{
		return Math.max(Math.max(a,b), Math.max(c, d));
	}
	
	static double gradeAverage(double a, double b, double c, double d)
	{
		return Math.round(((a+b+c+d)/4) * 10.0) / 10.0;
	}
	public static void main(String[] args) 
	{
		double randomNumber[], student[][];
		
		randomNumber = new double[3];
		student = new double[3][4];
		double min;
		double max;
		double average = 0;
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++)
		{
			System.out.print("Numbers: ");
			for(int j = 0; j < 3; j++)
			{
				randomNumber[j] = ((double) ( 10 * Math.random() ) + 1);
				randomNumber[j] = Math.round(randomNumber[j] * 100.0) / 100.0;
				System.out.print(randomNumber[j] + " ");
			}
			System.out.println();
			
			min = minimum(randomNumber[0], randomNumber[1], randomNumber[2]);
			max = maximum(randomNumber[0], randomNumber[1], randomNumber[2]);
			
			System.out.println("Minimum is " + min + " Maximum is " + max + "\n");
		}
		
		for(int k = 0; k < 3; k++)
		{
			for(int x = 0; x < 4; x++)
			{
				System.out.println("Enter an Integer Test Score: ");
				student[k][x] = input.nextInt();
			}
			
			System.out.println("Student " + (k + 1) + " Test Results");
			
			min = gradeMin(student[k][0], student[k][1], student[k][2], student[k][3]);
			max = gradeMax(student[k][0], student[k][1], student[k][2], student[k][3]);
			System.out.println("Minimum is " + min + " Maximum is " + max);
			
			average = Math.round(((student[k][0] + student[k][1] + student[k][2] + student[k][3]) / 4 * 100.0) / 100.0);
			System.out.println("Average is: " + average);
			
			average = (int) Math.round((student[k][0] + student[k][1] + student[k][2] + student[k][3]) / 4);
			if(average >= 90 && average <= 100)
				System.out.println("Letter Grade: A");
			else if(average >= 80 && average < 90)
				System.out.println("Letter Grade: B");
			else if(average >= 70 && average < 80)
				System.out.println("Letter Grade: C");
			else if(average >= 65 && average < 70)
				System.out.println("Letter Grade: D");
			else if(average <= 64)
				System.out.println("Letter Grade: F");
			else
				System.out.println("ERROR");
			
			System.out.println("\n\n");
		}
		
		

	}

}
