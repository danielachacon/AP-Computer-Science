package unit11.lab3;

import java.util.Scanner;

public class Pet 
{
	protected String name;
	protected int weight;
	protected int age;
	
	public String sound()
	{
		return "";
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setWeight(int weight)
	{
		this.weight = weight;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getWeight()
	{
		return weight;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public Pet()
	{
		this("",0,0);
	}
	public Pet(String name)
	{
		this(name,0,0);
	}
	public Pet(String name, int weight)
	{
		this("",weight,0);
	}
	public Pet(String name, int weight, int age)
	{
		this.name = name;
		this.weight = weight;
		this.age = age;
	}


}
