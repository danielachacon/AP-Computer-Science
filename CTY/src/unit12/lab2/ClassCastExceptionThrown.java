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
	String name;
	
	Child(String n)
	{
		super(n);
		name = n;
	}
}

public class ClassCastExceptionThrown
{
	Parent p;
	Child c;
	
	/**
	 * Precondition: p is initialized as an object
	 * Postcondition: p is set if it is parent but if child then exception is thrown
	 * @param p
	 * @throws ClassCastException
	 */
	// throws ClassCastException when Object p is an incompatible type
	public void setParent(Object p) throws ClassCastException
	{
		this.p = (Parent)p;
	}

	/**
	 * Precondition: c is initialized as an object
	 * Postcondition: c is set if it is child but if parent then exception is thrown
	 * @param c
	 * @throws ClassCastException
	 */
	// throws ClassCastException when Object c is an incompatible type
	public void setChild(Object c) throws ClassCastException
	{
		this.c = (Child)c;
	}

}
