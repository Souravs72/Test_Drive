package Algos;

import java.util.*;

public class hack
{
	public static void main(String args[] ) throws Exception 
    {
		Scanner sc= new Scanner(System.in);
        int t;
        t = sc.nextInt();
        for(int j=0;j<t;j++)
        {
	        int n,small;
	        n =sc.nextInt();
	        int arr[] =  new int[n];
	        for(int i=0;i<n;i++)
	              arr[i]= sc.nextInt();
	        int temp[] = new int[n];
            for (int i = 0; i < n; i++)
			{
				temp[i]  = arr[i];
			}
            
            Arrays.sort(temp);int b=0;
            for (int l = 0; l < n; l++)
			{
            	if(arr[l] != temp[l])
				{
	            	int z = temp[l];
	            	for (int i = l+1; i <n; i++)
	    			{
	    				if(arr[i]==z)
	    					b=i;
	    			}
	            	int c = arr[l];
	            	arr[l] = arr[b];
	            	arr[b] = c;
					break;
				}
            	
			}
            
	        for(int i=0;i<n;i++)
	        System.out.print(arr[i]+" ");
        }
    }
}
