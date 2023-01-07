package unit9;
import java.util.Scanner;
public class CounterConsoleMenu 
{
	private boolean quit;
	private String s;
	
	public void displayMenu()
	{
		System.out.print("Choices: \nMenu\nValue\nIncrement\nDecrement\nReset\nQuit\n");
	}
	
	public String getUserInput()
	{
		Scanner input = new Scanner(System.in);
		s = input.next();
		return s;
	}
	
	public void displayCurrentCountValue(Counter counter)
	{
		System.out.println("Value is: "  + counter.getCount());
	}
	
	public void increment(Counter counter)
	{
		counter.increment();
		System.out.println("done");
	}
	
	public void decrement(Counter counter)
	{
		counter.decrement();
		System.out.println("done");
	}
	
	public void reset(Counter counter)
	{
		counter.reset();
		System.out.println("done");
	}
	
	public void quit()
	{
		quit = true;
	}
	
	public void run(Counter counter)
	{
		quit = false;
		System.out.println("Welcome to the Counter Console Menu\n");
		displayMenu();
		while(quit == false)
		{
			s = getUserInput().toLowerCase();
			if(s.equals("increment") == true)
				increment(counter);
			else if(s.equals("decrement") == true)
				decrement(counter);
			else if(s.equals("reset") == true)
				reset(counter);
			else if(s.equals("quit") == true)
				quit();
			else if(s.equals("menu") == true)
				displayMenu();
			else if(s.equals("value") == true)
				displayCurrentCountValue(counter);
			else
				System.out.print("ERROR: User input not recognized");
		}
	}
	
	public CounterConsoleMenu()
	{
		
	}

	
}
