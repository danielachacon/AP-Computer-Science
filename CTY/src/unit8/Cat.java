package unit8;

public class Cat
{
	private String breed;
	private int age;
	private double weight;
	private char sex;
	private String name;
  
	public void setBreed(String breed)
	{
		this.breed = breed;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	
	public void setSex(char sex)
	{
		this.sex = sex;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getBreed()
	{
		return breed;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	public char getSex()
	{
		return sex;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String eat()
	{
		return "Munch, Munch, Munch";
	}
  
	public String meow()
	{
		return "Meeeeeeeooww";
	}
	
	public Cat(String breed, int age, double weight, char sex, String name)
	{
		this.breed = breed;
		this.age = age;
		this.weight = weight;
		this.sex = sex;
		this.name = name;
	}
}