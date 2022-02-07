package Dynamic_Arrays;

import java.util.*;
public class HashSets
{
	public static void main(String[] args)
	{
		Set<Integer> hs = new HashSet<Integer>();
		
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
