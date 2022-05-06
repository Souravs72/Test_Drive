package CodeChef;

import java.io.*;
import java.util.*;
public class SonyaAndQueries_713A
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		int n = Integer.parseInt(s); // The number of queries
		Map<Integer, Integer> map = new HashMap<>();
		String str;
		for(int i = 0; i < n; i++)
		{
			str = s;
			if(str.charAt(0) == '+' || str.charAt(0) == '-')
				modifyList(str, map);
			else if(str.charAt(0) == '?')
				System.out.println("Output =  "+printList(str, map));
				
		}
		
		
	}
	static void modifyList(String str, Map<Integer, Integer> map)
	{
		if(str.charAt(0) == '+')
		{
			int num = Integer.parseInt(str.substring(1));
			if(map.containsKey(num))
				map.put(num,  map.get(num) + 1);
			else
				map.put(num, 1);
		}
		else
		{
			int num = Integer.parseInt(str.substring(1));
			if(map.containsKey(num))
				map.put(num,  map.get(num) - 1);
		}
	}
	static int printList(String str,  Map<Integer, Integer> map)
	{
		for(int i = str.length() - 1; i > 0; i++)
		{
			
		}
		return -1;
	}
}
