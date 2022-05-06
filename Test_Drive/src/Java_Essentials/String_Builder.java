package Java_Essentials;

import java.util.*;
public class String_Builder
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
//		for(int i = 0; i < n; i++)
//			sb.append(i);
		
		sb.append("broisgood"); // add a string at the last to the former stringbuilder
		System.out.println(sb);
		
		// capacity of StringBuilder increases by (current length * 2) when the initial capacity is breached.
		System.out.println(sb.capacity()); 	
		
		sb.append('S'); // append a character to string
		sb.append("true", 0, 4); // String substring (true) from posiion 0 and ends at 4 is appended.
		sb.charAt(2); // returns the character at 2.
		sb.length(); // returns length of sb
		sb.insert(0, 'd'); // inserts character 'd' at specified location (0)
		sb.delete(10, 11); // deletes substring from 10 to 11.
		sb.insert(0, "Sourav"); // inserts String ("Sourav") at specified location (0)
		
		System.out.println(sb);
		
		
		if(sb.substring(0,6).equalsIgnoreCase("SOURAV"))
		{
			System.out.println("Yes");
			sb.replace(0, 6, "Mammi");
		}
		else
			System.out.println("No");
			
			
		System.out.println(sb.toString());
		sb.reverse();
		System.out.println(sb.toString());
	}
}
