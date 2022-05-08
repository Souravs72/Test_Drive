package GeeksForGeeks;

import java.util.*;

class Intervals
{
	int start, end;
	public void interval(int start, int end)
	{
		this.start = start;
		this.end = end;
		
	}
}
public class GFG3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Intervals ele = new Intervals();
		ele.interval(0,0);
		ArrayList<Intervals> a1= new ArrayList<Intervals>();;
		for(int i=0;i<5;i++)
		{
			int start = sc.nextInt();
			int end = sc.nextInt();
			ele.interval(start, end);
			a1.add(i,ele);
		}
		;
		for (int i = 0; i < a1.size(); i++)
		{
			System.out.println();
		}
		
		System.out.println(a1.toArray());
		mergeIntervals(a1);
		
	}
	static void mergeIntervals(ArrayList<Intervals> a1)
	{
		Collections.sort(a1,(a,b)->Integer.compare(a.start, b.start));
		
	}
}
