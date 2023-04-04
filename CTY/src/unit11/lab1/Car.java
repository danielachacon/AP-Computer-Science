package unit11.lab1;

public class Car 
{
	String Make;
	String Model;
	int year;
	
	public void setMake(String Make)
	{
		this.Make = Make;
	}
	
	public void setModel(String Model)
	{
		this.Model = Model;
	}
	
	public void setYear(int year)
	{
		this.year = year;
	}
	
	public String getMake()
	{
		return Make;
	}
	
	public String getModel()
	{
		return Model;
	}
	
	public int getYear()
	{
		return year;
	}
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
