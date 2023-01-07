package unit9;

public class CounterTest {

	public static void main(String[] args) 
	{
		Counter counter = new Counter();
		CounterConsoleMenu menu = new CounterConsoleMenu();
		
		menu.run(counter);

	}

}
