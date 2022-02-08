package Dynamic_Arrays;

import java.util.Arrays;

public class Arrays_Class
{
	public static void main(String[] args)
	{
		int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 , 12, 14, 15}; 
		int b[] = {16, 18,17,14, 13 , 19, 20, 24, 21, 22, 23, 25,15};
		
		int search = Arrays.binarySearch(a, 10); // returns the index of the searched element in the array. If not present returns -ve number
		
		if(search > 0)
			System.out.println(search); 
		else
			System.out.println("Not present");
		
		
		int fetch = Arrays.binarySearch(a, 13); 
		
		if(fetch > 0)
			System.out.println(search); 
		else
			System.out.println("Not present");
		
		
		Arrays.sort(b); // sorts the array
		for(int i: b)
		System.out.print(i+ " ");
		System.out.println();
		// Arrays.parallelSort(b); // allocates the divided array to differen processsors and sorts. Only works nicely if elements in array are more than 8192
		
		Arrays.fill(a, 13);
		for(int i: a)
			System.out.print(i+ " ");
		System.out.println();
		
		
		System.out.println(Arrays.toString(a));
		
	}
}
