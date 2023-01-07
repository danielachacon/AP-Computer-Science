package unit5;

import java.util.Scanner;

public class Unit5Lab2 //done
{
	static void printMonthCalendar(int m, int y)
	{
		printMonthHeader(m, y);
		printMonthBody(m, y);
	}
	
	static void printMonthHeader(int m, int y)
	{
		String month = getMonthName(m);
		
		System.out.println(month + " " + y);
		System.out.println("___________________________________________________");
		System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
	}
	
	static void printMonthBody(int m, int y)
	{
		int start = getStartDay(m, 1, y); 
		
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
		
		for(int i = 1; i <= getNumDaysInMonth(m, y); i++)
		{
			start++;
			if(start % 7 == 0)
				System.out.print(i + "\n");
			else
				System.out.print(i + "\t");
		}
	}
	
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

	static boolean isLeapYear(int y)
	{
		
		if(y % 4 == 0 && y % 100 != 0)
			return true;
		else if(y % 100 == 0 && y % 400 == 0 && y % 4 == 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) 
	{
		Scanner input = new Scanner( System.in );
		int month, year;
		
		System.out.print("Enter a month (1-12)" );
		month = input.nextInt();
		
		System.out.print("\nEnter a year" );
		year = input.nextInt();
		
		printMonthCalendar(month, year);
	
	}
	
}
