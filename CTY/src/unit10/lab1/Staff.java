package unit10.lab1;

/**
 * This class models a staff, whose traits are inherited by the employee Class.
 * This class has a job title along with their employee traits
 * @author Daniel Achacon
 *
 */
public class Staff extends Employee
{
	private String jobTitle;
	
	/**
	 * @return name of the class and name as a string
	 */
	public String toString()
	{
		return this.getClass() + " " + name;
	}
	
	//Constructors
	public Staff()
	{
		super("","","");
	}
	/**
	 * @param name
	 */
	public Staff(String name) 
	{
		super(name);
	}
	/**
	 * @param name
	 * @param emailAddress
	 */
	public Staff(String name, String emailAddress)
	{
		super(name, emailAddress,"");
	}
	/**
	 * @param name
	 * @param emailAddress
	 * @param phoneNumber
	 */
	public Staff(String name, String emailAddress, String phoneNumber)
	{
		super(name, emailAddress, phoneNumber);
	}
	/**
	 * @param name
	 * @param emailAddress
	 * @param phoneNumber
	 * @param BirthDate
	 */
	public Staff(String name, String emailAddress, String phoneNumber, Date BirthDate)
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
	public Staff(String name, String emailAddress, String phoneNumber, Date BirthDate, double salary)
	{
		super(name,emailAddress, phoneNumber, BirthDate, salary);
	}
	/**
	 * @param name
	 * @param emailAddress
	 * @param phoneNumber
	 * @param BirthDate
	 * @param salary
	 * @param hireDate
	 */
	public Staff(String name, String emailAddress, String phoneNumber, Date BirthDate, double salary, Date hireDate)
	{
		super(name,emailAddress, phoneNumber, BirthDate, salary, hireDate);
	}
}
