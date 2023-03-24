package unit9;
import java.util.Scanner;
public class CounterConsoleMenu 
{
	private boolean quit;
	private String s;
	Counter counter;
	
	public void displayMenu()
	{
		System.out.print("Choices: Menu, Value, Increment, Decrement, Reset, Quit\n");
	}
	
	public String getUserInput()
	{
		Scanner input = new Scanner(System.in);
		s = input.next();
		return s;
	}
	
	public void displayCurrentCountValue()
	{
		System.out.println("Value is: "  + this.counter.getCount());
	}
	
	public void increment()
	{
		this.counter.increment();
		System.out.println("done");
	}
	
	public void decrement()
	{
		this.counter.decrement();
		System.out.println("done");
	}
	
	public void reset()
	{
		this.counter.reset();
		System.out.println("done");
	}
	
	public void quit()
	{
		quit = true;
	}
	
	public void run()
	{
		quit = false;
		System.out.println("Welcome to the Counter Console Menu\n");
		displayMenu();
		while(quit == false)
		{
			s = getUserInput().toLowerCase();
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
			else
				System.out.print("ERROR: User input not recognized");
		}
	}
	
	public CounterConsoleMenu()
	{
		this.counter = new Counter();
	}
	
	public CounterConsoleMenu(Counter counter)
	{
		this.counter = counter;
	}

	
}
