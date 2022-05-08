package CodeChef;

/* package codechef; // don't place package name! */
/* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Mains
{
    public static void main (String[] args) throws java.lang.Exception
    {
        int i, j, n, ans = 0;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		int arr[] = new int[n];
		for(i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		int gcd = GCD(arr[0], arr[1]);
		int lcm = arr[0] * arr[1] / gcd;
		for(i = 2; i < n; i++)
		{
			gcd = GCD(lcm, arr[i]);
			lcm = lcm  * arr[i]/gcd;
		}
		System.out.println(lcm);
		
    }
    static int GCD(int a , int b)
    {
    	int maxm, minm;
    	
    	maxm = max(a, b);
    	minm = min(a , b);
    	
    	if(minm == 0)
    		return maxm;
    	while(maxm % minm != 0)
    	{
    		int temp = maxm;
    		maxm = minm;
    		minm = temp % minm;
    	}
    	return minm;
    }
    static int max(int a , int b)
	{
			if(a > b)
					return a;
			return b;
	}
	static int min(int a , int b)
	{
			if(a < b)
					return a;
			return b;
	}
}