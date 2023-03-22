package unit8;

/**
 * This class models the time of the day using the amount of seconds since Midnight.
 * 
 * It contains methods that set the time, get the time, hour, minute, and second,
 * and returns Strings that show the time in standardized format.  
 * 
 * @author danielachacon
 */
public class Time2 
{
	private int secondsSinceMidnight;
	
	/**
	 * No-argument Constructor
	 * initializes hour/minute/second/secondsSinceMidnight to 0;
	 */
	public Time2()
	{
		this(0,0,0);
	}
	

	/**
	 * Constructor
	 * @param hour
	 * Minutes and seconds defaulted to 0
	 */
	public Time2(int hour)
	{
		this(hour,0,0);
	}
	
	/**
	 * Constructor
	 * @param hour
	 * @param minute
	 *  seconds defaulted to 0
	 */
	public Time2(int hour, int minute)
	{
		this(hour,minute,0);
	}
	
	/**
	 * Constructor
	 * @param hour
	 * @param minute
	 * @param second
	 * Note: seconds in hour = hour * 3600
	 *       seconds in minute = minute * 60
	 */
	public Time2(int hour, int minute, int second)
	{
		if(hour < 0 || hour >= 24)
			throw new IllegalArgumentException("Hour must be 0-23");
		if(minute < 0 || minute >= 60)
			throw new IllegalArgumentException("Minute must be 0-59");
		if(second < 0 || second >= 60)
			throw new IllegalArgumentException("second must be 0-59");
		
		this.secondsSinceMidnight = hour * 3600 + minute * 60 + second;	//Formula to get total amount of seconds since midnight
	}
	
	/**
	 * Constructor
	 * @param time object
	 */
	public Time2(Time2 time)
	{
		this(time.getHour(), time.getMinute(), time.getSecond());
	}
	
	/**
	 * Sets the time
	 * @param hour
	 * @param minute
	 * @param second
	 */
	public void setTime(int hour, int minute, int second)
	{
		//Checks if each parameter is in bounds
		if(hour < 0 || hour >= 24)
			throw new IllegalArgumentException("Hour muyst be 0-23");
		if(minute < 0 || minute >= 60)
			throw new IllegalArgumentException("Minute must be 0-59");
		if(second < 0 || second >= 60)
			throw new IllegalArgumentException("second must be 0-59");
		
		this.secondsSinceMidnight = hour * 3600 + minute * 60 + second;	//Formula to get total amount of seconds since midnight
	}
	
	/**
	 * Sets only hour, keeps current minutes and seconds
	 * @param hour
	 */
	public void setHour(int hour)
	{
		//Checks if hour is in bounds
		if(hour < 0 || hour >= 24)
			throw new IllegalArgumentException("Hour must be 0-23");
		this.secondsSinceMidnight = (secondsSinceMidnight % 3600) + hour * 3600;	//Formula to set hour while keeping minutes and seconds
	}
	
	/**
	 * Sets only minute, keeps current hours and seconds
	 * @param minute
	 */
	public void setMinute(int minute)
	{
		//Checks if minute is in bounds
		if(minute < 0 || minute >= 60)
			throw new IllegalArgumentException("Minute must be 0-59");
		this.secondsSinceMidnight = secondsSinceMidnight - ((secondsSinceMidnight % 3600) - (secondsSinceMidnight % 3600 % 60)) + minute * 60;	//Formula to set minutes while keeping hours and seconds
	}
	
	/**
	 * Sets only seconds, keeps current hours and minutes
	 * @param second
	 */
	public void setSecond(int second)
	{
		//Checks if seconds is in bounds
		if(second < 0 || second >= 60)
			throw new IllegalArgumentException("second must be 0-59");
		this.secondsSinceMidnight = secondsSinceMidnight - (secondsSinceMidnight % 3600 % 60) + second;	//Formula to set seconds while keeping minutes and hours
	}
	
	/**
	 *  Gets current Hour
	 * @return Amount of hours
	 * Notes: Current Seconds = secondsSinceMidnight % 3600 % 60 
	 *        Remaining Minutes & Seconds (not including hours) in seconds = secondsSinceMidnight % 3600
	 */
	public int getHour() {return (secondsSinceMidnight - (secondsSinceMidnight % 3600))/3600;}	//Formula to get current Hour
	
	/**
	 *  Gets current Minute
	 * @return Amount of minutes
	 */
	public int getMinute() {return ((secondsSinceMidnight % 3600) - (secondsSinceMidnight % 3600 % 60))/60;}	//Formula to get current Minute
	
	/**
	 *  Gets current second
	 * @return Amount of seconds
	 */
	public int getSecond() {return secondsSinceMidnight % 3600 % 60;}
	
	//Convert to String in universal-time format (HH:MM:SS)
	public String toUniversalString()
	{
		return String.format("%02d:%02d:%02d", getHour(),getMinute(),getSecond());
	}
	
	//Convert to String in standard-time format (H:MM:SS AM or PM)
	public String toString()
	{
		return String.format("%d:%02d:%02d %s", ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),getMinute(),getSecond(), (getHour() < 12 ? "AM" : "PM"));
	}
	

}
