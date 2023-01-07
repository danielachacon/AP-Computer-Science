package unit2;

public class Unit2Lab1 {

	public static void main(String[] args) 
	{	
		char c = 'a';
		
		while(c <= 'z')
			System.out.print(c + " " + (int) c++ + " ");
		
		System.out.println();
		
		c = 'A';
		
		while(c <= 'Z')
			System.out.print(c + " " + (int) c++ + " ");
		
		System.out.println();
		
		c = '0';
		
		while(c <= '9')
			System.out.print(c + " " + (int) c++ + " ");
		
		System.out.println();
		
		System.out.print("+ " + (int) '+' + " ");
		System.out.print("- " + (int) '-' + " ");
		System.out.print("_ " + (int) '_' + " ");
		System.out.print("= " + (int) '=' + " ");
		System.out.print("& " + (int) '&' + " ");
		System.out.print("@ " + (int) '@' + " ");
		System.out.print("# " + (int) '#' + " ");
		System.out.print("$ " + (int) '$' + " ");
		System.out.print("? " + (int) '?' + " ");
		System.out.print("> " + (int) '>' + " ");
		System.out.print("< " + (int) '<' + " ");
		System.out.print("| " + (int) '|' + " ");
		System.out.print("! " + (int) '!' + " ");
		System.out.print("~ " + (int) '~' + " ");
		System.out.print("  " + (int) ' ' + " ");
	}

}
