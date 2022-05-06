package Dynamic_Arrays;

import java.util.*;
public class LearnMap
{
	public static void main(String[] args)
	{
		Map<Integer, String> map = new HashMap();
		
		map.put(1, "India"); //adds the value in key value pair to map.
		map.put(2, "USA");
		map.put(3, "UK");
		
		System.out.println(map);
		
		map.put(2, "Germany");		// when key is same, value gets overridden
		map.putIfAbsent(1, "Soraon"); // This adds the element in map only if key is not present already
		System.out.println(map);
		
		if(map.containsKey(2))
			map.put(4, "France");
		else
			System.out.println(map.entrySet());
		
		for(Map.Entry<Integer, String> entry: map.entrySet())
		{
			System.out.print(entry.getKey()+" ");
		}
		System.out.println();
		for(String str: map.values())
		{
			System.out.print(str+" ");
		}
		System.out.println(map.size());
	}
}
