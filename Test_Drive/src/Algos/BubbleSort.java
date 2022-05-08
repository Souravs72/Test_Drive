package Algos;

import java.util.Scanner;

public class BubbleSort 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,d=0;
		System.out.println("Enter the number of elements:\n");
		n = sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter the elements:\n");
		for(int i = 0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i = 0;i<n-1;i++)
		{
			boolean sorted = true;
			for(int j =1;j<n-i;j++)
			{	
				int temp= 0;
				if(arr[j-1]>arr[j])
				{
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					sorted = false; 
					++d;
				}
				
			}
			if(sorted) break;
		}
		for(int i = 0;i<n;i++)
		{
			System.out.println(arr[i]+"  ");
		}
		System.out.println("\n"+d);
		sc.close();
	}
}
