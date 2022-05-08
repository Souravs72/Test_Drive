package Algos;

import java.util.Scanner; 


public class hackkerrrank
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]= new int[n];
		int temp[]= new int[n];
		for(int i =0;i<n;i++)
			arr[i] = sc.nextInt();
		hackkerrrank obj = new hackkerrrank();
		obj.kadane(arr, n);
		sc.close();
	}
	void kadane(int arr[], int n)
	{
		int max_so_far = 0, max_end_here=0;
		for(int i=0;i<n;i++)
		{
			max_end_here+= arr[i];
			if(max_so_far<max_end_here)
				max_so_far = max_end_here;
			else if(max_end_here<0)
				max_end_here =0;
				
		}
		System.out.println(max_so_far);
	}
}
