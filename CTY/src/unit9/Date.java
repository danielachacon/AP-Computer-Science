package unit9;

import javax.swing.*;

public class Date 
{
	private int day;
	private int month;
	private int year;
	
	public void setDay(int day)
	{
		this.day = day;
	}
	public void setMonth(int month)
	{
		this.month = month;
	}
	public void setyear(int year)
	{
		this.year = year;
	}
	
	public int getDay()
	{
		return day;
	}
	public int getMonth()
	{
		return month;
	}
	public int getYear()
	{
		return year;
	}
	
	public void displayDate()
	{
		JOptionPane.showMessageDialog( null, "The date is" + month + "/" + day + "/" + year);
	}
}
