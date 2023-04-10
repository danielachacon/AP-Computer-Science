package unit12.lab2;

/*
 * ClassCastException - Runtime Exception
 * Thrown to indicate that the code has attempted to cast an object to a subclass of which it is not an instance
 * or when the code tried to cast an object of one class to another class type that does not have any relationship between them.
 */

public class ClassCastExceptionCatch {

	public static void main(String[] args)
	{
		ClassCastExceptionThrown test = new ClassCastExceptionThrown();

		System.out.println("ClassCastExceptionCatch allows you to set the value of Parent and Child objects");
		System.out.println("Test setting of Parent and Child objects:");

		Parent p = new Parent("Dad");
		Child c = new Child("Daniel");

		try
		{
			System.out.println("\nSetting Parent as Child Object");

			Parent newp = new Parent("Mom");
			test.setChild(newp); // pass Parent to setChild method which is not compatible with Child object
			
			System.out.print("SUCCESS: Assign Mom as a new Child.");
		}
		catch(ClassCastException e)
		{
			System.out.print("ERROR: Parent Mom cannot be cast to Child!\nException : " + e + "\n");
		}

		System.out.println("\nSetting Child as Parent Object");
		try
		{
			
			Child newc = new Child("Kyla");
			test.setParent(newc); // pass Child Object to setParent method. Since Child extends to Parent, then Child Kyla can be assigned to Parent Object
			
			System.out.print("SUCCESS: Assign Kyla as a new Parent.");
		}
		catch(ClassCastException e)
		{
			System.out.print("ERROR: Child Kyla cannot be cast to Parent!\nException : " + e);
		}

	}

}
