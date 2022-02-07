package Dynamic_Arrays;

import java.util.*;
public class TreeSets
{
	public static void main(String[] args)
	{
		Set<Integer> hs = new TreeSet<Integer>();
		
		hs.add(23);
		hs.add(14);
		hs.add(24);
		hs.add(32);
		hs.add(34);
		
		
		System.out.println(hs);
		
		hs.remove(24);
		
		if(hs.contains(14))
			System.out.println(hs.size());
	}
}
