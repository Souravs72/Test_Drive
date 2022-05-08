package CodeChef;

import java.io.IOException;
import java.util.Scanner;

public class Codechef
{
	public static void main (String[] args) throws IOException
	{
		try
		{
		    Scanner sc = new Scanner(System.in);
		    int t,k;
		    t = sc.nextInt();
		    for(k=0;k<t;k++)
		    {
		    	int n,i,p=0,j;
		    	n = sc.nextInt();
			    int arr[] = new int[n];
		    	for(i=0;i<n;i++)
			    {
			       arr[i] = sc.nextInt(); 
			    }
		    	for(i=0;i<n-2;i++)
			    {
		    		j=i;
				    p= Math.abs(arr[j]-arr[j+1])+Math.abs(arr[j+1]-arr[j+2])+Math.abs(arr[j+2]-arr[j]);
			    }
		    	System.out.println(p);
		    }
		    sc.close();
		}
		catch (Exception e) {
			return;
		}
	}
}