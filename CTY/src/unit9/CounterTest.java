package unit9;

public class CounterTest {

	public static void main(String[] args) 
	{
		Counter counter = new Counter(15);
		CounterConsoleMenu menu = new CounterConsoleMenu();
		CounterConsoleMenu menu2 = new CounterConsoleMenu(counter);
		
		menu.run();
		menu2.run();
	}

}
