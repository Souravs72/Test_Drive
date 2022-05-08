package GeeksForGeeks;

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG1
 {
	public static void main (String[] args)
	 {
    	int n , q , t,e,p,r;
    	ArrayList<Integer> a1;
    	Scanner sc = new Scanner(System.in);
    	t = sc.nextInt();
    	for(int l =0;l<t;l++)
    	{
	 	    n = sc.nextInt();
	 	    q = sc.nextInt();
	 	    
	 	    
	 	    a1 = new ArrayList<>(n);
	 	    for(int i=0;i<n;i++)
	 	    {
	 	        int j = sc.nextInt();
	 	    	a1.add(i,j);
	 	    }
	 	   
   	    
	   	    if(q==1)
	   	    {
	   	    	p =sc.nextInt();
	   	    	r = sc.nextInt();
	   	    	merge(a1,n,p,r);
	   	    	System.out.println();
	   	    }
	   	    
	   	    else if(q==2)
	   	    {
	   	    	e  = sc.nextInt();
	   	    	int b = a1.lastIndexOf(e);
	   	    	System.out.println(b);
	   	    	System.out.println();
	   	    }
	   	}
    	sc.close();
	 }
    private static void merge(ArrayList<Integer> a1,int n,int p, int r)
    {
   	 
   		 a1.add(p, r);
   		 for (int i = 0; i < a1.size(); i++)
			{
				System.out.print(a1.get(i)+" ");
			}
    }
 }
/*
2
5 1
1 4 5 9 3
2 6
4 2
1 9 2 4
4
*/