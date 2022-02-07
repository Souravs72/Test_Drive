package Dynamic_Arrays;

import java.util.Scanner;
import java.util.*;

public class Stacks 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Stack<String> animals = new Stack<>();
		animals.push("Lion"); // adds the element in the stack
		animals.push("Tiger");
		animals.push("Buffalo");
		animals.push("Hyena");
		
		System.out.println("Stack = " +animals);
		
		System.out.println(animals.peek()); // returns the top element  in the stack
		
		animals.pop();
		System.out.println("Modified stack: "+animals);
		
		animals.add(1, "Horse");
		
		Iterator it = animals.iterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println("");
	}

}

/*
 	Output:
 	
 	Stack = [Lion, Tiger, Buffalo, Hyena]
	Hyena
	Modified stack: [Lion, Tiger, Buffalo]
	Lion Horse Tiger Buffalo
	
	 */

