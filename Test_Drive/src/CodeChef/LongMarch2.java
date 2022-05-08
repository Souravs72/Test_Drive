package CodeChef;

import java.io.*;
import java.util.*;
public class LongMarch2
{
	public static void main(String[] args) throws IOException
	{
		try
		{
			Scanner sc = new Scanner(System.in);
		
			int t,group =0,d=0,res=0,count=0;
			t = sc.nextInt();
			String str="";
			for(int j =0;j<t;j++)
			{
				str = sc.next();
				for(int i=0;i<str.length();i++)
				{
					char ch = str.charAt(i);
					if (ch=='0')
					{
						count=0;
						if(group>=1)
						{	res+=1;
						    group=0;
						}
					}
					else
					{
						count++;
						
						group = Math.max(group, count);
						
						if(i==str.length()-1 && count >=1 && group>=1)
						    res+=1;
					}
				}
				System.out.println(res);
				group =d=res=count=0;
			}
			sc.close();
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}

