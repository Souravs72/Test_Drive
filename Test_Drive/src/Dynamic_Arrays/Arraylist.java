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
		System.out.print(arr);
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
		
		System.out.println(array.toArray()); // returns the list in array in correct order
		//
		//
		//
		
		arr.clear(); // cleans the entire List
		
		if(arr.isEmpty()) // checks if the array is Empty.
			arr.add(3);
		
		System.out.println(arr);
		sc.close();
	}
}


/* 
	Output
	
	[12, 14, 15]12
	14
	15
	4
	3
	2
	1
	4
	7
	[Ljava.lang.Object;@55f96302
	[3]
	
*/
