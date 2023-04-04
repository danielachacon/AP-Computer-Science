package unit10.lab4;

import java.util.Scanner;

public class PetTest 
{
	/**
	 * @return s
	 * Reads User input and stores it into s 
	 */
	public static String getUserInput()
	{
		Scanner input = new Scanner(System.in); 
		return input.next();
	}
	
	public static void main(String[] args)
	{
		String s;
		int petAmount = 3;
		Pet petArray[] = new Pet[petAmount];	//Array of Pets
		
		for(int i = 0; i < petAmount; i++)
		{	
			System.out.print("Enter Type of Pet: ");
			s = PetTest.getUserInput().toLowerCase();	//Receives User Input of type of Pet
			
			if(s.equals("dog"))
				petArray[i] = new Dog();		//Creates a new Dog Object
			else if(s.equals("cat"))
				petArray[i] = new Cat();	//Creates a new Cat Object
			else
			{
				System.out.println("Input not Recognized");
				return;
			}
			
			System.out.print("Enter Name of Pet: ");
			petArray[i].setName(PetTest.getUserInput());	//Receive User Input of Name and stores it into current element of the array
			System.out.print("Enter Weight of Pet: ");
			petArray[i].setWeight(Integer.parseInt(PetTest.getUserInput()));	//Receive User Input of Weight and stores it into current element of the array
			System.out.print("Enter Age of Pet: ");
			petArray[i].setAge(Integer.parseInt(PetTest.getUserInput()));	//Receive User Input of Age and stores it into current element of the array
			
			System.out.println();
		}
		
		//Prints all elements of the Pet Array and their attributes 
		for(int i = 0; i < petAmount; i++)
		{
			System.out.println("Pet " + (i + 1) + " Name: " + petArray[i].getName() + " Weight (lbs): " + petArray[i].getWeight() + " Age (years): " + petArray[i].getAge() + " Sound: " + petArray[i].sound());
		}
	}

}
