package CodeChef;
import java.io.*;
import java.util.*;
public class codechefff
{
	public static void main (String[] args) throws IOException
	{
		try
		{
		    Scanner sc = new Scanner(System.in);
		    int t,k=0,i=0;
		    t = sc.nextInt();
		    for(k=0;k<t;k++)
		    {
		    	int n,result=0;
		    	n = sc.nextInt();
		    	int A[] = new int[n];
		    	for (i = 0; i <n; i++)
		    		A[i] = sc.nextInt();
		    	if(n>2)
		    	{
		    		Arrays.sort(A);
		    		result = A[n-1]*A[n-2] + A[n-1] - A[n-2]; 
		    	}
		    	else
		    		result = A[0]*A[1] + Math.max(A[0]-A[1], A[1]-A[0]);
		    	System.out.println(result);
		    }
		    sc.close();
		}
		catch (Exception e) {
			return;
		}
	}
}