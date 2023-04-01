package unit10;

/**
 * This class models an employee, whose traits are inherited by the Person Class.
 * This class has a hire Date and a salary along with their Person traits
 * @author Daniel Achacon
 *
 */
public class Employee extends Person 
{
	protected double salary;
	protected Date hireDate = new Date();
	
	/**
	 * @return name of the class and name as a string
	 */
	public String toString()
	{
		return this.getClass() + " " + name;
	}
	
	//Constructors
	public Employee()
	{
		super("","","");
	}
	/**
	 * @param name
	 */
	public Employee(String name) 
	{
		super(name);
	}
	/**
	 * @param name
	 * @param emailAddress
	 */
	public Employee(String name, String emailAddress)
	{
		super(name, emailAddress,"");
	}
	/**
	 * @param name
	 * @param emailAddress
	 * @param phoneNumber
	 */
	public Employee(String name, String emailAddress, String phoneNumber)
	{
		super(name, emailAddress, phoneNumber);
	}
	/**
	 * @param name
	 * @param emailAddress
	 * @param phoneNumber
	 * @param BirthDate
	 */
	public Employee(String name, String emailAddress, String phoneNumber, Date BirthDate)
	{
		super(name,emailAddress, phoneNumber, BirthDate);
	}
	/**
	 * @param name
	 * @param emailAddress
	 * @param phoneNumber
	 * @param BirthDate
	 * @param salary
	 */
	public Employee(String name, String emailAddress, String phoneNumber, Date BirthDate, double salary)
	{
		super(name,emailAddress, phoneNumber, BirthDate);
		this.salary = salary;
	}
	/**
	 * @param name
	 * @param emailAddress
	 * @param phoneNumber
	 * @param BirthDate
	 * @param salary
	 * @param hireDate
	 */
	public Employee(String name, String emailAddress, String phoneNumber, Date BirthDate, double salary, Date hireDate)
	{
		super(name,emailAddress, phoneNumber, BirthDate);
		this.salary = salary;
		this.hireDate = hireDate;
	}
}
