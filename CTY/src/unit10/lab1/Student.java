package unit10.lab1;

/**
 * This class models a student, whose traits are inherited by the person Class.
 * This class has a class Status along with their Person traits
 * @author Daniel Achacon
 *
 */
public class Student extends Person
{
	private String classStatus;
	
	/**
	 * @return name of the class and name as a string
	 */
	public String toString()
	{
		return this.getClass() + " " + name;
	}
	
	//Constructors
	public Student()
	{
		super("","","");
	}
	/**
	 * @param name
	 */
	public Student(String name) 
	{
		super(name);
	}
	/**
	 * @param name
	 * @param emailAddress
	 */
	public Student(String name, String emailAddress)
	{
		super(name, emailAddress,"");
	}
	/**
	 * @param name
	 * @param emailAddress
	 * @param phoneNumber
	 */
	public Student(String name, String emailAddress, String phoneNumber)
	{
		super(name, emailAddress, phoneNumber);
	}
	/**
	 * @param name
	 * @param emailAddress
	 * @param phoneNumber
	 * @param BirthDate
	 */
	public Student(String name, String emailAddress, String phoneNumber, Date BirthDate)
	{
		super(name,emailAddress, phoneNumber, BirthDate);
	}
	/**
	 * @param name
	 * @param emailAddress
	 * @param phoneNumber
	 * @param BirthDate
	 * @param classStatus
	 */
	public Student(String name, String emailAddress, String phoneNumber, Date BirthDate, String classStatus)
	{
		super(name,emailAddress, phoneNumber, BirthDate);
		this.classStatus = classStatus;
	}

}
