package unit11.lab2;

import java.util.ArrayList;
import java.util.HashMap;

public class Unit11Lab2 
{
	
	public static void removeDuplicates(ArrayList<Integer> list)
	{
		HashMap<Integer, Integer> DuplicateCheck = new HashMap<Integer, Integer>();
		int i = 0;
		
		while(i < list.size())	//Iterates until (including) the last element
		{
			if(DuplicateCheck.containsKey(list.get(i)))	//If the hash map has a key for the current int in list then remove it (key exist = already appeared in the ArrayList)
				list.remove(i);
			else	//If the hash map does not have a key, this is the first time the int has appeared in the ArrayList
			{
				DuplicateCheck.put(list.get(i), 1);	//Creates a Key and sets the value to 1
				i++;	//Goes to the next unchecked element of the Array List
			}
		}
	}
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>(10);
		
		list.add(1);
		list.add(4);
		list.add(5);
		list.add(4);
		list.add(5);
		list.add(4);
		list.add(7);
		list.add(8);
		list.add(1);
		list.add(10);
		
		//Display Original List
		System.out.println("Original List");
		for(int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
		
		removeDuplicates(list);
		
		//Display list without duplicates
		System.out.println("\nFinal List Without Duplicates");
		for(int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
	
	}

}
