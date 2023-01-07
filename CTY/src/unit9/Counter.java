package unit9;

public class Counter 
{
	private int count;
	
	public int getCount()
	{
		return count;
	}
	
	public void increment()
	{
		count++;
	}
	
	public void decrement()
	{
		count--;
	}
	
	public void reset()
	{
		count = 0;
	}

	public Counter()
	{
		count = 0;
	}
}
