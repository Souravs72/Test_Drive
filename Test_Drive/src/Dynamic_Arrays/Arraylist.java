//    Here I will use all the methods of the ArrayList which is a class belonging to list interface. 

package Dynamic_Arrays;
import java.lang.reflect.Array;
import java.util.*;

public class Arraylist
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(12); // adds 12 to the list
		arr.add(1, 14); // adds 14 to the index 1
		arr.add(15);
		System.out.println(arr); // prints the list
		System.out.println(arr.size()); // checks for the size of the arr
		//
		//
		//
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.addAll(arr); // copies all the elements of ArrayList arr to array.
		
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(4);
		
		for(int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i)); // get() is used to fetch the elements at index i
		}
		System.out.println(list.lastIndexOf(4)); // checks for the last index of 4 in array
		
		 Integer[] n = new Integer[arr.size()]; 
		 
		 n = arr.toArray(n);// returns the list in array in correct order
		 for(int i= 0; i < arr.size(); i++)
		 {
			 System.out.print(n[i]+" ");
		 }
		 System.out.println("");
		//
		//
		//
		
		arr.clear(); // cleans the entire List
		
		if(arr.isEmpty()) // checks if the array is Empty.
			arr.add(3);
		
		if(arr.contains(3)) // checks if the array contains this element
			System.out.println("Arr contains 3");
		else
			System.out.println("Array doesn't contain 3");
			
		if(list.containsAll(arr)) //checks if the List array contains all the elements present in List arr
			System.out.println("Array contains all the elements in arr");
		else
			System.out.println("Array doesn't contain all the elements in arr");
		
		arr.add(2);
		arr.add(5);
		arr.add(7);
		
		if(arr.equals(list)) // equals() is used to compare two lists whether both lists have the same size and all corresponding pairs of elements in the two lists are equal or not
			System.out.println("Equal");
		else
			System.out.println("Not equal");
		
		
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next()+" ");
		}
		
		// Adding the lists in a list
		listOfLists.add(list);
		listOfLists.add(arr);
				
		System.out.println();
		for(int i = 0; i < listOfLists.size(); i++)
		{
			for (int j = 0; j < listOfLists.get(i).size(); j++)
			{
				System.out.print(listOfLists.get(i).get(j)+" ");
			}
			System.out.println("");
		}
			
		sc.close();
	}
}


/* 
	Output
	
	[12, 14, 15]
	3
	12
	14
	15
	4
	3
	2
	1
	4
	7
	12 14 15 
	Arr contains 3
	Array contains all the elements in arr
	Not equal
	[3, 2, 5, 7]
	
*/
