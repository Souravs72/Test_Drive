package CodeChef;

import java.util.Scanner;

public class codechess
{
	public static void main(String[] args)
	{
		try
		{
		    Scanner sc = new Scanner(System.in);
		    int t,k,i=0,d=0;
		    t = sc.nextInt();
		    for(k=0;k<t;k++)
		    {
		    	int len,c;
		    	char ch = '0',ch1='1';
		    	len=sc.nextInt();
		    	c = sc.nextInt();
		    	sc.nextLine();
		    	String str = sc.next();
		    	if((int)str.charAt(0)-48==c && len>=3)
		    	{
		    		for(i=0;i<len-2;i++)
		    			if((str.charAt(i)==ch && str.charAt(i+1)==ch1 && str.charAt(i+2)==ch1) ||(str.charAt(i)==ch1 && 									str.charAt(i+1)==ch1 && str.charAt(i+2)==ch))
		    					d+=1;
		    			
		    	}
		    	if(d>1)
		    		System.out.println("YES");
		    	else
		    		System.out.println("NO");
		    }
		    sc.close();
		}
		catch (Exception e) {
			return;
		}
	}
}
