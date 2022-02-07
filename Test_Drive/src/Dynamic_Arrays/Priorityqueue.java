package Dynamic_Arrays;

import java.util.*;

public class Priorityqueue 
{
	public static void main(String[] args)
	{
		Queue<Integer> pq = new PriorityQueue(); // min heap priority queue
		
		Queue<Integer> q = new PriorityQueue(Comparator.reverseOrder()); // max heap priority queue
		
		pq.offer(5); // adds the element in PriorityQueue
		pq.offer(3);
		pq.offer(2);
		pq.offer(4);
		pq.offer(1);
		
		q.addAll(pq);
		System.out.println(pq); // PriorityQueue returns the element in a prioritised basis. Priortises on the basis of min-heap; 
		
		System.out.println(pq.poll()); // removes and returns the element that has highest priority
		
		Iterator<Integer> it = pq.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		
		System.out.println(pq.peek());
		
		System.out.println("Max heapified priority queue:  "+q);
	}
}
