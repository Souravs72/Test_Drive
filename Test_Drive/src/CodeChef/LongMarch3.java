package CodeChef;

import java.io.*;
import java.util.*;
public class LongMarch3
{
	public static void main(String[] args) throws IOException
	{
		try
		{
			Scanner sc = new Scanner(System.in);
		
			int t;
			long N,E,H,res=0;
			t = sc.nextInt();
			
			long price[] = new long[3];
			for(int j =0;j<t;j++)
			{
				N= sc.nextLong();
				E = sc.nextLong();
				H = sc.nextLong();
				
				for(int i=0;i<3;i++)
					price[i] = sc.nextLong();
				 
				if(N>E && N>H || N*2>E && N>H || N*3>H && N>E)
				{
					res =-1;
				}
				else if(E==N && H==N)
				{
					res = price[2]*N;
				}
				else if(E>=2*N && H<=N)
				{
					res = price[0]*N;
				}
				else if(H>=3*N && N<E)
				{
					res = price[1]*N;
				}
				else
				{
					int small =0,i=0;
					for ( i = 1; i < 3; i++)
					{
						if(price[small]>price[i])
							small = i;
					}
					System.out.println(price[small]);
					if(small==2 && ((E>=N && H>=N) || E<N))
					{
						res = price[small] * N;
					}
				}
				System.out.println(res);
				res =0;
			}			
			sc.close();
		}
		catch (Exception e) 
		{
			return;
		}
	}
}

