package CodeChef;

import java.io.*;
import java.util.*;


public class LongMarch4
{
	public static void main(String[] args) throws IOException
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			
			int t , C,  d= 0 ,k=0, j =0;
			t = sc.nextInt();
			while(t-->0) 
			{	
				C = sc.nextInt();
				byte binary[] = new byte[40];
				while(C>0)
				{
					binary[k++] = (byte) ((byte)C % 2);
					C = C/2;
				}
				int A = 0,B = 0;
				for(int i =binary.length-1;i>=0;i--)
				{
					if(i%2==0 && binary[i]!=0)
					{
						A= A*10+1;
						B=B*10;
					}
					else if(i%2==1 && binary[i]!=0)
					{
						A= A*10;
						B=B*10+1;
					}
					else if(binary[i]==0)
					{
						A= A*10+1;
						B=B*10+1;
					}
				}
				System.out.println(A);
				System.out.println(B);
				A =0;
				B=0;
			}
			sc.close();
		}
		catch(Exception e)
		{
			return;
		}
	}
}
