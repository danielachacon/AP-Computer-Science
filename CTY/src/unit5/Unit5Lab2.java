package unit5;

import java.util.Scanner;

/**
 * This class receives a month and year and then prints a calendar template for that month using
 * static function printMonthCalendar
 * 
 * @author Daniel Achacon
 */

public class Unit5Lab2 //done
{
	/**
	 * @param month
     * @param year
     * Prints Month Header and Month Body using static functions printMonthHeader
     * and printMonthBody
	 */
	
	static void printMonthCalendar(int m, int y)
	{
		printMonthHeader(m, y);
		printMonthBody(m, y);
	}
	
	/**
	 * @param month
     * @param year
     * Prints the Month of the Year's Calendar Header 
     */
	
	static void printMonthHeader(int m, int y)
	{
		String month = getMonthName(m);
		
		System.out.println(month + " " + y);
		System.out.println("___________________________________________________");
		System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
	}
	
	/**
	 * @param month
     * @param year
     * Prints the Month of the Year's Calendar Body
	 */
	
	static void printMonthBody(int m, int y)
	{
		int start = getStartDay(m, 1, y); 
		
		//Spacing for the Start Day of the Month
		switch(start)
		{
		case 1: System.out.print("\t");
		case 2: System.out.print("\t\t"); break;
		case 3: System.out.print("\t\t\t"); break;
		case 4: System.out.print("\t\t\t\t"); break;
		case 5: System.out.print("\t\t\t\t\t"); break;
		case 6: System.out.print("\t\t\t\t\t\t"); break;
		case 7: System.out.print(""); break;
		}
		
		//Checks to see if the day needs to go to the next line
		for(int i = 1; i <= getNumDaysInMonth(m, y); i++)
		{
			start++;
			if(start % 7 == 0)
				System.out.print(i + "\n");
			else
				System.out.print(i + "\t");
		}
	}
	
	/**
	 * @param Month 
     * @return String of the Month's name
	 */
	
	static String getMonthName(int m)
	{
		switch(m)
		{
		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		default:
			return "";
		}
		
	}
	/**
	 * @param Month
     * @param Day
     * @param Year
     * @return Starting day of the month as an integer
  	 */
	
	static int getStartDay(int m, int d, int y)
	{
	    // Adjust month number & year to fit Zeller's numbering system
	    if ( m < 3 ) 
	    {
	      m = m + 12;
	      y = y - 1;
	    }
	    
	    int k = y % 100;      // Calculate year within century
	    int j = y / 100;      // Calculate century term
	    int h = 0;            // Day number of first day in month 'm'
	    
	    h = ( d + ( 13 * ( m + 1 ) / 5 ) + k + ( k / 4 ) + ( j / 4 ) + ( 5 * j ) ) % 7;
	    
	    // Convert Zeller's value to ISO value (1 = Mon, ... , 7 = Sun )
	    int dayNum = ( ( h + 5 ) % 7 ) + 1;     
	    
	    return dayNum;
	}
	
	/**
	 * @param Month
     * @param Year
     * @return Number of Days in that specific month
	 */
	
	static int getNumDaysInMonth(int m, int y)
	{
		switch(m)
		{
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			return 31;
			
		case 4: case 6: case 9: case 11:
			return 30;
			
		case 2:
			boolean year = isLeapYear(y);
			if(year == true)
				return 29;
			else
				return 28;	
			
		default:
			return 0;
		}
	}
	
	/**
	 * @param year
     * @return True or False if the inputed year is a leap year
	 */
	
	static boolean isLeapYear(int y)
	{
		
		if(y % 4 == 0 && y % 100 != 0)	//Condition 1: Year is divisible by 4 and not divisible by 100
			return true;
		else if(y % 100 == 0 && y % 400 == 0 && y % 4 == 0)	//Condition 2: Year is divisible by 100, 400, and 4
			return true;
		else	//If either two conditions are not met, then not a leap year
			return false;
	}

	public static void main(String[] args) 
	{
		Scanner input = new Scanner( System.in );
		int month, year;
		
		System.out.print("Enter a month (1-12)" );
		month = input.nextInt();	//Receives Month value
		
		System.out.print("\nEnter a year" );
		year = input.nextInt();	//Receives Year value
		
		printMonthCalendar(month, year);
	
	}
	
}
