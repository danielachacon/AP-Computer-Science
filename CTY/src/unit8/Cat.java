package unit8;
/**
 * This class models a cat which has attributes breed, age, weight, sex, and name.
 * It contains methods which allow it to get and set the values of each attribute. 
 *   
 * @author Daniel Achacon
 */
public class Cat
{
	private String breed;
	private int age;
	private double weight;
	private char sex;
	private String name;
  
	/**
	 * @param type of breed as a string
     * Sets the breed of the cat
     */
	public void setBreed(String breed)
	{
		this.breed = breed;
	}
	
	/**
	 * @param age as a integer
     * Sets the age of the cat
     */
	public void setAge(int age)
	{
		this.age = age;
	}
	
	/**
	 * @param weight as a integer
     * Sets the age of the cat
     */
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	
	/**
	 * @param sex as a character
     * Sets the sex of the cat
     */
	public void setSex(char sex)
	{
		this.sex = sex;
	}
	
	/**
	 * @param name as a string
     * Sets the name of the cat
     */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
     * @return current breed of the cat
     */
	public String getBreed()
	{
		return breed;
	}
	
	/**
     * @return current age of the cat
     */
	public int getAge()
	{
		return age;
	}
	
	/**
     * @return current weight of the cat
     */
	public double getWeight()
	{
		return weight;
	}
	
	/**
     * @return current sex of the cat
     */
	public char getSex()
	{
		return sex;
	}
	
	/**
     * @return current name of the cat
     */
	public String getName()
	{
		return name;
	}
	
	/**
     * @return Eating Behavior as a String
     */
	public String eat()
	{
		return "Munch, Munch, Munch";	//invokes the cat's eating behavior
	}
  
	/**
     * @return Meow Behavior as a String
     */
	public String meow()
	{
		return "Meeeeeeeooww";	//invokes the cat's meow behavior
	}
	
	/**
	 * Constructor
	 * @param breed
	 * @param age
	 * @param weight
	 * @param sex
	 * @param name
 	*/
	public Cat(String breed, int age, double weight, char sex, String name)
	{
		this.breed = breed;
		this.age = age;
		this.weight = weight;
		this.sex = sex;
		this.name = name;
	}
}