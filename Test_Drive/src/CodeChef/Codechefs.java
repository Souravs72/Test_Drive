package CodeChef;

import java.util.Scanner;

public class Codechefs
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		try 
		{
			short t;
			int m,h,bmi;
			t= sc.nextShort();
			for(long i=0;i<t;i++)
			{
				int d=0;
				m =sc.nextInt();
				h=sc.nextInt();
				bmi = m/(h*h);
				if(bmi<=18)
					d =1;
				else if(bmi>=19 && bmi<=24)
					d=2;
				else if(bmi>=25 && bmi <=29)
					d =3;
				else if(bmi>=30)
					d=4;
				System.out.println(d);
			}
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	
		sc.close();
	}
}
