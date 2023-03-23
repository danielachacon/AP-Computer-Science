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
	 * Postconditions: this.day is an integer that is in the range within the days of a certain month
	 * @param day
	 */
	public void setDay(int day)
	{
		if(day < 0)
			throw new IllegalArgumentException("Day must be greater than 0");
		else if((this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10 || this.month == 12)  && day > 31)
			throw new IllegalArgumentException("Day must be between 1 - 31");
		else if((this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) && day > 30)
			throw new IllegalArgumentException("Day must be between 1-30");
		else if(this.month == 2 && day > 28)
			throw new IllegalArgumentException("Day must be between 1-28");
		else
			this.day = day;
	}
	
	/**
	 * Preconditions: month is an integer that is in range (1-12)
	 * Postconditions: this.month contains a value is an integer that is (1-12)
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
	 * Postconditions: this.year contains a value and is an integer that is >= 0
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
	 * Postconditions: day is an integer that is in the range within the days of a certain month
	 * @return day
	 */
	public int getDay()
	{
		return day;
	}
	
	/**
	 * Preconditions: month contains a value that is an integer that is in the range 1-12
	 * Postconditions: month is an integer that is in the range 1-12
	 * @return day
	 */
	public int getMonth()
	{
		return month;
	}
	
	/**
	 * Preconditions: year contains a value is a nonnegative integer
	 * Postconditions: year is a nonnegative integer
	 * @return day
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
		JOptionPane.showMessageDialog( null, "The date is" + month + "/" + day + "/" + year);
	}
	
}
