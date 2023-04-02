package unit10;


public class MemoryCounter extends Counter
{
	private int memory;
	
	/**
	 * @return count
	 * Gives user current value of count
	 */
	public int getMemoryCount()
	{
		return memory;
	}
	/**
	 * Sets memory to 0
	 */
	public void resetMemory()
	{
		memory = 0;
	}
	
	/**
	 * Adds count to memory
	 */
	public void addMemory()
	{
		memory += count;
	}
	
	/**
	 * Constructor
	 */
	public MemoryCounter()
	{
		super();
	}
	
	/**
	 * Constructor
	 * @param count
	 */
	public MemoryCounter(int count)
	{
		super(count);
	}
}
