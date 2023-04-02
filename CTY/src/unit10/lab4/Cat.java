package unit10.lab4;

public class Cat extends Pet
{
	public String sound()
	{
		return "Meow";
	}

	public Cat()
	{
		super("",0,0);
	}
	public Cat(String name)
	{
		super(name,0,0);
	}
	public Cat(String name, int weight)
	{
		super("",weight,0);
	}
	public Cat(String name, int weight, int age)
	{
		super(name,weight,age);
	}
}
