package Dynamic_Arrays;

import java.util.*;
public class TreeMaps
{
	public static void main(String[] args)
	{
		Map<String,Integer> map = new TreeMap<>();
				
		map.put("India", 1); //adds the value in key value pair to map.
		map.put("USA", 2);
		map.put("UK", 3);
		
		System.out.println(map);
		
		map.put("Germany", 2);		// when key is same, value gets overridden
		map.putIfAbsent("Soraon", 6); // This adds the element in map only if key is not present already
		System.out.println(map);
		
		if(map.containsValue(2))
			map.put("France", 4);
		else
			System.out.println(map.entrySet());  // Prints the entries
		
		for(Map.Entry<String, Integer> entry: map.entrySet()) // Iterates through all the entries
		{
			System.out.print(entry.getKey()+" ");
		}
		System.out.println();
		

		System.out.println(map.remove("Soraon"));
		for(Integer i: map.values())
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		for(String str: map.keySet())
		{
			System.out.print(str+" ");
		}
		
	}
}
