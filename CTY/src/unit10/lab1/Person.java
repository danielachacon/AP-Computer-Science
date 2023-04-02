package unit10.lab1;

/**
 * This class models a person
 * This class has a name, address, email address, phone number, and birth date
 * @author Daniel Achacon
 *
 */
public class Person 
{
	protected String name;
	protected String address;
	protected String emailAddress;
	protected String phoneNumber;
	protected Date birthDate;
	
	/**
	 * @return name of the class and name as a string
	 */
	public String toString()
	{
		return this.getClass() + " " + name;
	}
	
	//Constructors
	public Person()
	{
		this("","","");
	}
	/**
	 * @param name
	 */
	public Person(String name)
	{
		this(name,"","");
	}
	/**
	 * @param name
	 * @param emailAddress
	 */
	public Person(String name, String emailAddress)
	{
		this(name,emailAddress, "");
	}
	/**
	 * @param name
	 * @param emailAddress
	 * @param phoneNumber
	 * @param BirthDate
	 */
	public Person(String name, String emailAddress, String phoneNumber, Date BirthDate)
	{
		this(name, emailAddress, phoneNumber);
		this.birthDate = BirthDate;
	}
	/**
	 * @param name
	 * @param emailAddress
	 * @param phoneNumber
	 */
	public Person(String name, String emailAddress, String phoneNumber)
	{
		this.name = name;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
	}


	
}

