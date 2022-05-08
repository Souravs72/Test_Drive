package CodeChef;

import java.io.*;
import java.util.*;
class contest
{
	public static void main(String[] args) throws Exception
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			int t;
			t=sc.nextInt();
			for(int l=0;l<t;l++)
			{
				int n,k;
				
				n=sc.nextInt();
				k= sc.nextInt();
				if(k==0)
				   System.out.print(n);
				else
    				System.out.println(n%k);
			}
		}
		catch(Exception e)
		{
			return;
		}
	}
}