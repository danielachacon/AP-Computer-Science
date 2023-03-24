package unit9;
import java.util.Scanner;
public class CounterConsoleMenu 
{
	private boolean quit;
	private String s;
	Counter counter;
	
	/**
	 * Displays User Choices 
	 */
	private void displayMenu()
	{
		System.out.print("Choices: Menu, Value, Increment, Decrement, Reset, Quit\n");
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
		System.out.println("Value is: "  + this.counter.getCount());
	}
	
	/**
	 * Calls method increment in counter to add 1 to the current counter 
	 */
	private void increment()
	{
		this.counter.increment();
		System.out.println("done");
	}
	
	/**
	 * Calls method decrement in counter to subtract 1 to the current counter 
	 */
	private void decrement()
	{
		this.counter.decrement();
		System.out.println("done");
	}
	
	/**
	 * Calls method reset in counter to set the current counter to 0
	 */
	private void reset()
	{
		this.counter.reset();
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
		System.out.println("Welcome to the Counter Console Menu\n");
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
			else								//If none of the options were listed or spelling error
				System.out.print("ERROR: User input not recognized");
		}
	}
	
	/**
	 * Default Constructor
	 * Creates a new counter object 
	 */
	public CounterConsoleMenu()
	{
		this.counter = new Counter();
	}
	
	/**
	 * Default Constructor
	 * Sets local counter to counter 
	 */
	public CounterConsoleMenu(Counter counter)
	{
		this.counter = counter;
	}

	
}
