package CodeChef;
import java.io.IOException;
import java.util.Scanner;

public class codeche
{
	public static void main(String[] args) throws IOException
	{
		try 
		{
			Scanner sc = new Scanner(System.in);
			byte t,i=0;
			t = sc.nextByte();
			while(i< t)
			{
				int n,k;
				n = sc.nextInt();
				k = sc.nextInt();
				int arr[] = new int[k];
				for(int j=0;j<k;j++)
				{
					 arr[j] = sc.nextInt();
				}
				String s1 = sc.next();
				String s2 = sc.next();
				
				byte res =0,res1=0;
				for(int j=0;j<k;j++)
				{
					res+= ((int)s1.charAt(j)-48)*arr[j];
					res1+= ((int)s2.charAt(j)-48)*arr[j];
				}
				System.out.println(res);
				System.out.println(res1);
				i++;
					
			}
			sc.close();
		}
		catch (Exception e) 
		{
			return;
		}
	}
}
