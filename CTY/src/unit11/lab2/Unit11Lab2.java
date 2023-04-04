package unit11.lab2;

import java.util.ArrayList;
import java.util.HashMap;

public class Unit11Lab2 
{
	
	public static void removeDuplicates(ArrayList<Integer> list)
	{
		HashMap<Integer, Integer> DuplicateCheck = new HashMap<Integer, Integer>();
		int i = 0;
		
		while(i < list.size())
		{
			if(DuplicateCheck.containsKey(list.get(i)))
				list.remove(i);
			else
			{
				DuplicateCheck.put(list.get(i), 1);
				i++;
			}
		}
	}
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>(10);
		
		list.add(1);
		list.add(4);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(4);
		list.add(7);
		list.add(8);
		list.add(1);
		list.add(10);
		
		removeDuplicates(list);
		
		for(int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		
	}

}
