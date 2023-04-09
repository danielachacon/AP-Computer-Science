package unit12.lab2;

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

public class ClassCastExceptionThrown
{
	public void ClassCastExceptionMethod() throws ClassCastException
	{
		Parent pTest = new Parent("Daniel");
		Child cTest = new Child("Xavier");
	
		Child cTest2 = (Child) pTest;	//Casted an object of the parent class to the child type class --> Exception thrown
	}
}
