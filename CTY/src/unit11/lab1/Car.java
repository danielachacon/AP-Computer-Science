package unit11.lab1;

public class Car 
{
	String Make;
	String Model;
	int year;
	
	public Car()
	{
		this("","",0);
	}
	
	public Car(String Make)
	{
		this(Make,"",0);
	}
	
	public Car(String Make, String Model)
	{
		this(Make,Model,0);
	}
	
	public Car(String Make, String Model, int year)
	{
		this.Make = Make;
		this.Model = Model;
		this.year = year;
	}
}
