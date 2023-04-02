package unit10;

import java.util.Scanner;

import unit9.Counter;

public class MemoryCounterConsoleMenu 
{
	private boolean quit;
	private String s;
	private MemoryCounter memory;
	
	/**
	 * Displays User Choices 
	 */
	private void displayMenu()
	{
		System.out.print("Choices: Menu, Value, Increment, Decrement, Reset, Quit, addmem, resetmem\n");
	}
	
	/**
	 * @return s
	 * Reads User input and stores it into s 
	 */
	private String getUserInput()
	{
		Scanner input = new Scanner(System.in);
		s = input.next();
		return s;
	}
	
	/**
	 * Displays the current value of count 
	 */
	private void displayCurrentCountValue()
	{
		System.out.println("Value is: "  + this.memory.getCount());
		System.out.println("Memory Value is: "  + this.memory.getMemoryCount());
	}
	
	/**
	 * Calls method addMemory in MemoryCounter to add count to memory
	 */
	private void addMemory()
	{
		memory.addMemory();
		System.out.println("done");
	}
	
	/**
	 * Calls method addMemory in MemoryCounter to add count to memory
	 */
	private void resetMemory()
	{
		memory.resetMemory();
		System.out.println("done");
	}
	
	/**
	 * Calls method increment in Counter to add 1 to the current counter 
	 */
	private void increment()
	{
		this.memory.increment();
		System.out.println("done");
	}
	
	/**
	 * Calls method decrement in Counter to subtract 1 to the current counter 
	 */
	private void decrement()
	{
		this.memory.decrement();
		System.out.println("done");
	}
	
	/**
	 * Calls method reset in Counter to set the current counter to 0
	 */
	private void reset()
	{
		this.memory.reset();
		System.out.println("done");
	}
	
	/**
	 * Stops the program by turning quit to true 
	 */
	private void quit()
	{
		quit = true;
	}
	
	/**
	 * Runs the console-based UI for counter objects. Continuously while quit == false. Calls the other methods based on user input 
	 */
	public void run()
	{
		quit = false;		//Sets quit to false to start the UI to run if it was quit before
		System.out.println("Welcome to the Memory Counter Console Menu\n");
		displayMenu();		
		while(quit == false)
		{
			s = getUserInput().toLowerCase();		//Gets user input and reads through the if statements below
			if(s.equals("increment") == true)
				increment();
			else if(s.equals("decrement") == true)
				decrement();
			else if(s.equals("reset") == true)
				reset();
			else if(s.equals("quit") == true)
				quit();
			else if(s.equals("menu") == true)
				displayMenu();
			else if(s.equals("value") == true)
				displayCurrentCountValue();
			else if(s.equals("addmem") == true)
				addMemory();
			else if(s.equals("resetmem") == true)
				resetMemory();
			else								//If none of the options were listed or spelling error
				System.out.print("ERROR: User input not recognized");
		}
	}
	
	/**
	 * Default Constructor
	 * Creates a new Memory Counter object 
	 */
	public MemoryCounterConsoleMenu()
	{
		this.memory = new MemoryCounter();
	}
	
	/**
	 * Default Constructor
	 * Sets local memory counter to memory counter 
	 */
	public MemoryCounterConsoleMenu(MemoryCounter memory)
	{
		this.memory = memory;
	}

}
