package CodeChef;

import java.io.*;
import java.util.Scanner;

public class codechefss
{
	public static void main(String[] args) throws Exception
	{
		try
		{
			Scanner sc =new Scanner(System.in);
			int t,l=0,i=0;
			t = sc.nextInt();
			for(l= 0;l<t;l++)
			{
				int del_charge, price_coupon,tot1=0,tot2=0;
				del_charge = sc.nextInt();
				price_coupon =sc.nextInt();
				int Day1[] = new int[3];
				int Day2[] = new int[3];
				for(i=0;i<3;i++)
					Day1[i]  =sc.nextInt();
				for(i=0;i<3;i++)
					Day2[i]  =sc.nextInt();
				for(i=0;i<3;i++)
				{
					tot1+= Day1[i];
					tot2+= Day2[i];
				}
				if(tot1>=150 && tot2>=150)
				{
					if(del_charge*2 > price_coupon)
						System.out.println("Yes");
					else
						System.out.println("No");
				}
				else if(tot1>=150 && tot2<150)
				{
					if(del_charge > price_coupon)
						System.out.println("Yes");
					else
						System.out.println("No");
				}
				else if(tot2>=150 && tot1 <150)
				{
					if(del_charge > price_coupon)
						System.out.println("Yes");
					else
						System.out.println("No");
				}
				else
				    System.out.println("No");
			}
			sc.close();
		}
		catch (Exception e) 
		{
			return;
		}
	}
}
