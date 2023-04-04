package unit11.lab3;

import java.util.ArrayList;
import java.util.Scanner;

import unit10.lab4.PetTest;

public class Unit11Lab3 
{
	/**
	 * @return s
	 * Reads User input and stores it into s 
	 */
	private static String getUserInput()
	{
		Scanner input = new Scanner(System.in); 
		return input.next();
	}
	
	/**
	 * @param list
	 * @return average of the age
	 */
	public static double calculateAverage(ArrayList<Pet> list)
	{
		int sum = 0;
		
		for(int i = 0; i < list.size(); i++)
			sum += list.get(i).getAge();	// goes through list and adds the age to sum
		
		return sum / list.size();	//average = total / amount of objects
		
	}
	
	public static void main(String[] args)
	{
		String s;
		int petAmount = 3;
		
		ArrayList<Pet> petList = new ArrayList<Pet>(petAmount);
		
		for(int i = 0; i < petAmount; i++)
		{
			System.out.print("Enter Type of Pet: ");
			
			s = getUserInput().toLowerCase();	//Receives User Input of type of Pet
			
			if(s.equals("dog"))
				petList.add(new Dog());
			else if(s.equals("cat"))
				petList.add(new Cat());
			else
			{
				System.out.println("Input not Recognized");
				return;
			}
			
			System.out.print("Enter Name of Pet: ");
			petList.get(i).setName(PetTest.getUserInput());	//Receive User Input of Name and stores it into current element of the array
			System.out.print("Enter Weight of Pet: ");
			petList.get(i).setWeight(Integer.parseInt(PetTest.getUserInput()));	//Receive User Input of Weight and stores it into current element of the array
			System.out.print("Enter Age of Pet: ");
			petList.get(i).setAge(Integer.parseInt(PetTest.getUserInput()));	//Receive User Input of Age and stores it into current element of the array
			
			System.out.println();
		}
		
		//Prints all elements of the Pet Array and their attributes 
		for(int i = 0; i < petAmount; i++)
			System.out.println("Pet " + (i + 1) + " Name: " + petList.get(i).getName() + " Weight (lbs): " + petList.get(i).getWeight() + " Age (years): " + petList.get(i).getAge() + " Sound: " + petList.get(i).sound());
		
		//Prints Average age of all Pets
		System.out.println("Average Age: "  + calculateAverage(petList) + " years");
		
	}
}