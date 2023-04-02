package unit10.lab1;

public class PersonTest {

	public static void main(String[] args) 
	{
		Person Daniel = new Person("Daniel");
		Employee Max = new Employee("Max");
		Faculty Jason = new Faculty("Jason");
		Staff Ryan = new Staff("Ryan");
		Student Trevor = new Student("Trevor");
		
		System.out.println(Daniel.toString());
		System.out.println(Max.toString());
		System.out.println(Jason.toString());
		System.out.println(Ryan.toString());
		System.out.println(Trevor.toString());
	}

}
