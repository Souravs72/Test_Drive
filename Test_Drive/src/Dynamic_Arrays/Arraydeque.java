package Dynamic_Arrays;
import java.util.*;
public class Arraydeque
{
	public static void main(String[] args)
	{
		ArrayDeque<Integer> ad = new ArrayDeque<Integer>();

		ad.offer(15);
		ad.offerFirst(3);// adds the element in the first position
		ad.offerFirst(2);
		ad.offerFirst(1);
		ad.offerLast(14); // works similar to offer. Here the element is added at the last
		
		System.out.println(ad);
		
		System.out.println(ad.poll());
		System.out.println(ad.pollFirst());
		System.out.println(ad.pollLast());
		
		System.out.println(ad);
	}
}
/*

	Output:
	
	[1, 2, 3, 15, 14]
	1
	2
	14
	[3, 15]
*/