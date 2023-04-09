package unit12.lab2;

/*
 * ClassCastException - Runtime Exception
 * Thrown to indicate that the code has attempted to cast an object to a subclass of which it is not an instance
 * or when the code tried to cast an object of one class to another class type that does not have any relationship between them.
 */
class Parent
{
	String name;
	
	Parent(String name)
	{
		this.name = name;
	}
}

class Child extends Parent
{
	String childName;
	
	Child(String n)
	{
		super(n);
		childName = n;
	}
}

public class ClassCastExceptionCatch {

	public static void main(String[] args)
	{
		try
		{
			Parent pTest = new Parent("Daniel");
			Child cTest = new Child("Xavier");
			
			Child cTest2 = (Child) pTest;	//Casted an object of the parent class to the child type class --> Exception thrown
			System.out.print("It Works!");
		}
		catch(ClassCastException e)
		{
			System.out.print("Parent cannot be cast to Child");
		}

	}

}
