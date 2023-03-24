package unit9;

public class Counter 
{
	private int count;
	
	/**
	 * @return count
	 * Gives user current value of count
	 */
	public int getCount()
	{
		return count;
	}
	
	/**
	 * Adds current count by 1
	 */
	public void increment()
	{
		count++;
	}
	
	/**
	 * Subtracts current count by 1
	 */
	public void decrement()
	{
		count--;
	}
	
	/**
	 * Sets count to 0
	 */
	public void reset()
	{
		count = 0;
	}
	
	/**
	 * Default Constructor
	 * Sets count to 0
	 */
	public Counter()
	{
		count = 0;
	}
	
	/**
	 * Constructor
	 * @param count
	 */
	public Counter(int count)
	{
		this.count = count;
	}
}
