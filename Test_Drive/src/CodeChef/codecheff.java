package CodeChef;

import java.io.*;
import java.util.Scanner;

public class codecheff
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc =new Scanner(System.in);
			int t,l=0,i=0,j=0;
			long[][] dur_episodes= {};
			t = sc.nextInt();
			for(l= 0;l<t;l++)
			{
				//User input
				int seasons;
				seasons =sc.nextInt();
				int dur_songs[] = new int[seasons];
				int no_episodes[] = new int[seasons];
				
				for(i=0;i<seasons;i++)
				{
					dur_songs[i] = sc.nextInt();
				}
				
				for(i=0;i<seasons;i++)
				{
					no_episodes[i] = sc.nextInt();
					dur_episodes = new long[seasons][no_episodes[i]];
					for (j = 0; j < no_episodes[i]; j++)
					{
						dur_episodes[i][j] = sc.nextLong();
					}
				}
				long tot_dur=0;
				//Start operations
				for (i = 0; i < seasons; i++)
				{
					System.out.println(seasons);
					System.out.println(i);
					System.out.println(no_episodes[i]);
					if(no_episodes[i]==1)
					{
						System.out.println(dur_episodes[i][0]);
						tot_dur+= dur_episodes[i][0];
						System.out.println(tot_dur);
					}
					else if(no_episodes[i]>1)
					{
						System.out.println(dur_episodes[i][0]);
						tot_dur+= dur_episodes[i][0];
						
						for (j = 1; j <no_episodes[i]; j++)
						{
							System.out.println(dur_episodes[i][j]);
							System.out.println(dur_songs[i]);
							tot_dur+= dur_episodes[i][j] -dur_songs[i];
							System.out.println(tot_dur);
						}
					}
				}
				System.out.println(tot_dur);
				
			}
			sc.close();
		
		
	}
}

//for(i=0;i<seasons;i++)
//{
//	for (j = 0; j < no_episodes[i]; j++)
//	{
//		dur_episodes[i][j] = sc.nextInt();
//	}
//}
/*
 *

2
2
1 2
1 2
2 3 4

2
1 2
1 2
2 3 4
5
10 10 10 10 10
1 11
1 11
1 11
1 11
1 11

 */
