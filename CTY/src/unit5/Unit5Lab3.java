package unit5;

import java.util.Scanner;

/**
 * This class calculates the minimum and maximum of 3 different data sets filled with
 * random doubles using static functions minimum and maximum. It calculates the 
 * minimum, maximum,  grade average, and letter grade for 3 different students with 4
 * grades each.
 * 
 * Grading: A = 90-100, B = 80-89, C = 70-79, D = 65-69, F = 64 or less
 * 
 * @author Daniel Achacon
 */

public class Unit5Lab3 {
	
	/**
	 * @param value 1
	 * @param value 2
	 * @param value 3
     * @return minimum value
     */
	
	static double minimum(double a, double b, double c)
	{		
		return Math.min(a, Math.min(b,c));
	}
	
	/**
	 * @param value 1
	 * @param value 2
	 * @param value 3
     * @return maximum value
     */
	
	static double maximum(double a, double b, double c)
	{	
		return Math.max(a, Math.max(b, c));
	}
	
	/**
	 * @param grade 1
	 * @param grade 2
	 * @param grade 3
	 * @param grade 4
     * @return lowest grade
     */
	
	static double gradeMin(double a, double b, double c, double d)
	{
		return Math.min(Math.min(a,b), Math.min(c, d));
	}
	
	/**
	 * @param grade 1
	 * @param grade 2
	 * @param grade 3
	 * @param grade 4
     * @return highest grade
     */
	
	static double gradeMax(double a, double b, double c, double d)
	{
		return Math.max(Math.max(a,b), Math.max(c, d));
	}
	
	/**
	 * @param grade 1
	 * @param grade 2
	 * @param grade 3
	 * @param grade 4
     * @return average of the grades
     */
	
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
		
		//Produces 3 different data sets
		for(int i = 0; i < 3; i++)
		{
			System.out.print("Numbers: ");
			for(int j = 0; j < 3; j++)	//Fills 1 data set with 3 different double values 
			{
				randomNumber[j] = ((double) ( 10 * Math.random() ) + 1);
				randomNumber[j] = Math.round(randomNumber[j] * 100.0) / 100.0;	//rounded to nearest hundredth
				System.out.print(randomNumber[j] + " ");
			}
			System.out.println();
			
			//Finds Min and Max of 1 set and stores it
			min = minimum(randomNumber[0], randomNumber[1], randomNumber[2]);
			max = maximum(randomNumber[0], randomNumber[1], randomNumber[2]);
			
			System.out.println("Minimum is " + min + " Maximum is " + max + "\n");
		}
		
		//Takes in Values for 3 different Students
		for(int k = 0; k < 3; k++)
		{
			for(int x = 0; x < 4; x++)	//Receives User Input for 4 Grades
			{
				System.out.println("Enter an Integer Test Score: ");
				student[k][x] = input.nextInt();
			}
			
			System.out.println("Student " + (k + 1) + " Test Results");
			
			//Finds Min and Max
			min = gradeMin(student[k][0], student[k][1], student[k][2], student[k][3]);
			max = gradeMax(student[k][0], student[k][1], student[k][2], student[k][3]);
			System.out.println("Minimum is " + min + " Maximum is " + max);
			
			//Finds average
			average = Math.round(((student[k][0] + student[k][1] + student[k][2] + student[k][3]) / 4 * 100.0) / 100.0);
			System.out.println("Average is: " + average);
			
			//Uses integer average and converts to a letter grade
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
