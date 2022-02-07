package Dynamic_Arrays;

import java.util.*;
public class LinkedHashSets
{
	public static void main(String[] args)
	{
		Set<Integer> hs = new LinkedHashSet<Integer>();
		
		hs.add(14);
		hs.add(34);
		hs.add(42);
		hs.add(34);
		
		
		System.out.println(hs);
		
		hs.remove(24);
		
		if(hs.contains(14))
			System.out.println(hs.size());
	}
}
