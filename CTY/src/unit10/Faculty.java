package unit10;

/**
 * This class models a faculty, whose traits are inherited by the employee Class.
 * This class has office hours and a rank along with their employee traits
 * @author Daniel Achacon
 *
 */
public class Faculty extends Employee
{
	private String officeHours;
	private String rank;
	
	/**
	 * @return name of the class and name as a string
	 */
	public String toString()
	{
		return this.getClass() + " " + name;
	}
	
	//Constructors
	public Faculty()
	{
		super("","","");
	}
	/**
	 * @param name
	 */
	public Faculty(String name) 
	{
		super(name);
	}
	/**
	 * @param name
	 * @param emailAddress
	 */
	public Faculty(String name, String emailAddress)
	{
		super(name, emailAddress,"");
	}
	/**
	 * @param name
	 * @param emailAddress
	 * @param phoneNumber
	 */
	public Faculty(String name, String emailAddress, String phoneNumber)
	{
		super(name, emailAddress, phoneNumber);
	}
	/**
	 * @param name
	 * @param emailAddress
	 * @param phoneNumber
	 * @param BirthDate
	 */
	public Faculty(String name, String emailAddress, String phoneNumber, Date BirthDate)
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
	public Faculty(String name, String emailAddress, String phoneNumber, Date BirthDate, double salary)
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
	public Faculty(String name, String emailAddress, String phoneNumber, Date BirthDate, double salary, Date hireDate)
	{
		super(name,emailAddress, phoneNumber, BirthDate, salary, hireDate);
	}
	/**
	 * @param name
	 * @param emailAddress
	 * @param phoneNumber
	 * @param BirthDate
	 * @param salary
	 * @param hireDate
	 * @param OfficeHours
	 * @param rank
	 */
	public Faculty(String name, String emailAddress, String phoneNumber, Date BirthDate, double salary, Date hireDate, String officeHours, String rank)
	{
		super(name,emailAddress, phoneNumber, BirthDate, salary, hireDate);
		this.officeHours = officeHours;
		this.rank = rank;
	}
}
