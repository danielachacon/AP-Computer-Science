package unit11.lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class CarTest {

	public static void main(String[] args) 
	{
		int amountOfCars = 5;
		ArrayList<Car> Cars = new ArrayList<Car>(amountOfCars);
		ArrayList<Car> OldCars = new ArrayList<Car>();
		ArrayList<Car> NewCars = new ArrayList<Car>();
		Scanner input = new Scanner(System.in); 
		
		for(int i = 0; i < amountOfCars; i++)
		{
			Cars.add(new Car());
			System.out.print("Enter Make for Car " + (i + 1) + ": ");
			Cars.get(i).setMake(input.nextLine());
			System.out.print("Enter Model for Car " + (i + 1) + ": ");
			Cars.get(i).setModel(input.nextLine());
			System.out.print("Enter year for Car " + (i + 1) + ": ");
			Cars.get(i).setYear(Integer.parseInt(input.nextLine()));
		}
		
		for(int i = 0; i < amountOfCars; i++)
		{
			if(Cars.get(i).getYear() >= 2010)
				NewCars.add(Cars.get(i));
			else
				OldCars.add(Cars.get(i));
		}
		
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
