package unit9;

import javax.swing.*;

/**
 * This class models the date of the year and has methods that can create dialog boxes that display the date in mm/dd/yyyy format
 * @author Daniel Achacon
 */

public class Date 
{
	private int day;
	private int month;
	private int year;
	
	/**
	 * Preconditions: day is an integer that is in the range within the days of a certain month. Must have the month of the year available
	 * Postconditions: day of the date is day, this.day is an integer that is in the range within the days of a certain month
	 * @param day
	 */
	public void setDay(int day)
	{
		if(day < 0)
			throw new IllegalArgumentException("Day must be greater than 0");
		else if((this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10 || this.month == 12)  && day > 31)
			throw new IllegalArgumentException("Day must be between 1 - 31 for month " + month);
		else if((this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) && day > 30)
			throw new IllegalArgumentException("Day must be between 1-30 for month " + month);
		else if(this.month == 2 && day > 28)
			throw new IllegalArgumentException("Day must be between 1-28 for month " + month);
		else
			this.day = day;
	}
	
	/**
	 * Preconditions: month is an integer that is in range (1-12)
	 * Postconditions: month of the date is month, this.month contains a value is an integer that is (1-12)
	 * @param month
	 */
	public void setMonth(int month)
	{
		if(month < 0 || month > 12)
			throw new IllegalArgumentException("Month must be in the range 1-12");
		else
			this.month = month;
	}
	
	/**
	 * Preconditions: year is an integer that is >= 0
	 * Postconditions: year of the date is year, this.year contains a value and is an integer that is >= 0
	 * @param year
	 */
	public void setyear(int year)
	{
		if(year < 0)
			throw new IllegalArgumentException("Year must be greater or equal to 0");
		else
			this.year = year;
	}
	
	/**
	 * Preconditions: day contains a value that is an integer that is in the range within the days of a certain month
	 * Postconditions: current day is returned, day is an integer that is in the range within the days of a certain month
	 * @return day
	 */
	public int getDay()
	{
		return day;
	}
	
	/**
	 * Preconditions: month contains a value that is an integer that is in the range 1-12
	 * Postconditions: current month of date is returned, month is an integer that is in the range 1-12
	 * @return month
	 */
	public int getMonth()
	{
		return month;
	}
	
	/**
	 * Preconditions: year contains a value is a nonnegative integer
	 * Postconditions: current year of date is returned, year is a nonnegative integer
	 * @return year
	 */
	public int getYear()
	{
		return year;
	}
	
	/**
	 * Preconditions: Month, Day, and Year all contain values
	 * Postconditions: Dialog Box will display Month/Day/Year in mm/dd/yyyy format
	 */
	public void displayDate()
	{
		JOptionPane.showMessageDialog( null, "The date is " + month + "/" + day + "/" + year);
	}
	
	/**
	 * Constructor
	 * Postconditions: Date is automatically set to January 1st, 0 (1/1/0)
	 */
	public Date()
	{
		this(1,1,0);
	}
	
	/**
	 * Constructor
	 * Preconditions: month is an integer that is in range (1-12)
	 * Postconditions: month of the date is month, this.month contains a value is an integer that is (1-12)
	 * @param month
	 */
	public Date(int month)
	{
		this(month,1,0);
	}
	
	/**
	 * Constructor
	 * Preconditions: month is an integer that is in range (1-12)
	 * Postconditions: the month of the date is month and the day of the date is day, all contain values that are in each respective range
	 * @param month
	 * @param day
	 */
	public Date(int month, int day)
	{
		this(month,day,0);
	}
	
	/**
	 * Constructor
	 * Preconditions: month is an integer that is in range (1-12)
	 * Postconditions: the month of the date is month, the day of the date is day, the year of the date is year, all contain values that are in each respective range
	 * @param month
	 * @param day
	 * @param year
	 */
	public Date(int month, int day, int year)
	{
		if(month < 0 || month > 12)
			throw new IllegalArgumentException("Month must be in the range 1-12");
		if(year < 0)
			throw new IllegalArgumentException("Year must be greater or equal to 0");
		this.month = month;
		
		if((this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10 || this.month == 12)  && day > 31)
			throw new IllegalArgumentException("Day must be between 1 - 31 for month " + month);
		else if((this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) && day > 30)
			throw new IllegalArgumentException("Day must be between 1-30 for month " + month);
		else if(this.month == 2 && day > 28)
			throw new IllegalArgumentException("Day must be between 1-28 for month " + month);
		
		this.day = day;
		this.year = year;
	}
	
}
