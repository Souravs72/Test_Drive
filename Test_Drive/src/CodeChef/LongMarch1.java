package CodeChef;

import java.io.*;
import java.util.*;
public class LongMarch1
{
	public static void main(String[] args)
	{
		try
		{
			Scanner sc = new Scanner(System.in);
		
			int x,N,H,d=0;
			
			N = sc.nextInt();
			H = sc.nextInt();
			x = sc.nextInt();
			int T[] = new int[N];
			for(int i =0;i<N;i++)
				T[i] = sc.nextInt();
			if(H==x)
			{
				System.out.println("Yes");
				return;
			}
			
			for(int i =0;i<N;i++)
			{
				if(T[i]+x==H)
				{
					d = 1;
				}
				
			}
			if(d==0)
				System.out.println("No");
			else
				System.out.println("Yes");
			sc.close();
		}
		catch (Exception e) 
		{
			return;
		}
	}
}
