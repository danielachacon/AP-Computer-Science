package unit11.lab3;

public class Dog extends Pet
{
	public String sound()
	{
		return "Bow Wow";
	}
	
	public Dog()
	{
		super("",0,0);
	}
	public Dog(String name)
	{
		super(name,0,0);
	}
	public Dog(String name, int weight)
	{
		super("",weight,0);
	}
	public Dog(String name, int weight, int age)
	{
		super(name,weight,age);
	}
}
