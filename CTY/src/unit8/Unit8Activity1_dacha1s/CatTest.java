package unit8;

public class CatTest {

	public static void main(String[] args) 
	{
		Cat cat1 = new Cat("Husky", 5, 110, 'm', "Zac");
		Cat cat2 = new Cat("Poodle", 5, 110, 'f', "Ty");

		System.out.println("Cat 1 Attribute: Breed: " + cat1.getBreed() 
						+ " Age: " + cat1.getAge() + " Weight:  " + cat1.getWeight()
						+ " Sex: " + cat1.getSex() + " Name: " + cat1.getName());
		
		System.out.println("Cat 2 Attribute: Breed: " + cat2.getBreed() 
		+ " Age: " + cat2.getAge() + " Weight: " + cat2.getWeight()
		+ " Sex: " + cat2.getSex() + " Name: " + cat2.getName());
		
		cat1.setName("Reece");
		cat1.setAge(10);
		System.out.println("Cat 1 Attribute: Breed: " + cat1.getBreed() 
		+ " Age:" + cat1.getAge() + " Weight: " + cat1.getWeight()
		+ " Sex: " + cat1.getSex() + " Name: " + cat1.getName());
		
		cat2.setAge(1);
		cat2.setWeight(60);
		System.out.println("Cat 2 Attribute: Breed: " + cat2.getBreed() 
		+ " Age: " + cat2.getAge() + " Weight: " + cat2.getWeight()
		+ " Sex: " + cat2.getSex() + " Name: " + cat2.getName());
		
		System.out.print(cat2.meow());
		
	}

}
