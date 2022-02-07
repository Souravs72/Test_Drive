//    Here I will use all the methods of the ArrayList which is a class belonging to list interface. 

package Dynamic_Arrays;
import java.util.*;

public class Arraylist
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		List<Integer> arr = new ArrayList<Integer>();
		
		arr.add(12); // adds 12 to the list
		arr.add(1, 14); // adds 14 to the index 1
		arr.add(15);
		System.out.println(arr); // prints the list
		System.out.println(arr.size()); // checks for the size of the arr
		//
		//
		//
		
		List<Integer> array = new ArrayList<Integer>();
		array.addAll(arr); // copies all the elements of ArrayList arr to array.
		
		array.add(4);
		array.add(3);
		array.add(2);
		array.add(1);
		array.add(4);
		
		for(int i = 0; i < array.size(); i++)
		{
			System.out.println(array.get(i)); // get() is used to fetch the elements at index i
		}
		System.out.println(array.lastIndexOf(4)); // checks for the last index of 4 in array
		
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
			
		if(array.containsAll(arr)) //checks if the List array contains all the elements present in List arr
			System.out.println("Array contains all the elements in arr");
		else
			System.out.println("Array doesn't contain all the elements in arr");
		
		arr.add(2);
		arr.add(5);
		arr.add(7);
		
		if(arr.equals(array)) // equals() is used to compare two lists whether both lists have the same size and all corresponding pairs of elements in the two lists are equal or not
			System.out.println("Equal");
		else
			System.out.println("Not equal");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println(arr);
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
