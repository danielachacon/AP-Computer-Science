package unit10;


public class MemoryCounterTest {

	public static void main(String[] args) 
	{
		MemoryCounter memory = new MemoryCounter(15);
		MemoryCounterConsoleMenu menu = new MemoryCounterConsoleMenu();
		MemoryCounterConsoleMenu menu2 = new MemoryCounterConsoleMenu(memory);
		
		menu.run();
		menu2.run();
	}

}
