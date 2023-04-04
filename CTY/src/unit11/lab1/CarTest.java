package unit11.lab1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class creates 3 ArrayLists and prompts the user to enter data for 5 Car objects and stores them in an ArrayList
 * The program iterates over the list and stores any car with vehicle year earlier than 2010 into OldCar ArrayList and 
 * cars with vehicle year >= 2010 into NewCar ArrayList
 * @author Daniel Achacon
 */
public class CarTest {

	public static void main(String[] args) 
	{
		int amountOfCars = 5;
		ArrayList<Car> Cars = new ArrayList<Car>(amountOfCars);
		ArrayList<Car> OldCars = new ArrayList<Car>();
		ArrayList<Car> NewCars = new ArrayList<Car>();
		Scanner input = new Scanner(System.in); 
		
		//Asks for attributes for amountOFCars amount of Cars
		for(int i = 0; i < amountOfCars; i++)
		{
			Cars.add(new Car());
			System.out.print("Enter Make for Car " + (i + 1) + ": ");
			Cars.get(i).setMake(input.nextLine());	//Receives make user input
			System.out.print("Enter Model for Car " + (i + 1) + ": ");
			Cars.get(i).setModel(input.nextLine());	//Receives model user input
			System.out.print("Enter year for Car " + (i + 1) + ": ");
			Cars.get(i).setYear(Integer.parseInt(input.nextLine()));	//Receives year user input
		}
		
		//Iterates through Car ArrayList and checks the year attribute
		for(int i = 0; i < amountOfCars; i++)
		{
			if(Cars.get(i).getYear() >= 2010)	//If the year attribute of the Car greater than or equal to 2010, then add it to NewCar Arraylist
				NewCars.add(Cars.get(i));
			else
				OldCars.add(Cars.get(i));	//If the year attribute of the Car less than to 2010, then add it to OldCar Arraylist
		}
		
		//Iterates through each element of the ArrayList Prints out all attributes of each element
		System.out.println("\nArrayList of All Cars: ");
		
		for(int i = 0; i < amountOfCars; i++)
			System.out.println("Make: " + Cars.get(i).getMake() + " Model: " + Cars.get(i).getModel() + " Year: " + Cars.get(i).getYear());
		
		System.out.println("\nArrayList of New Cars: ");
		
		for(int i = 0; i < NewCars.size(); i++)
			System.out.println("Make: " + NewCars.get(i).getMake() + " Model: " + NewCars.get(i).getModel() + " Year: " + NewCars.get(i).getYear());
		
		System.out.println("\nArrayList of Old Cars: ");
		
		for(int i = 0; i < OldCars.size(); i++)
			System.out.println("Make: " + OldCars.get(i).getMake() + " Model: " + OldCars.get(i).getModel() + " Year: " + OldCars.get(i).getYear());
	}

}
