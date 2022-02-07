package Dynamic_Arrays;

import java.util.*;

public class Queues
{
	public static void main(String[] args) 
	{
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(12); // adds the element to the queue but isn't considered safe when using capacity restricted queue.
		q.offer(14); // adds the element to the queue but does not violate capacity constraint.
		q.offer(15);
		q.offer(13);
		
		int peek = q.peek(); // returns the top element of the queue
		System.out.println(peek);
		
		q.offer(11);
		System.out.println(q);
		
		System.out.println(q.poll());// removes the element at top and returns the head of the deleted item. Returns null, if queue is empty.
		System.out.println(q.remove());// removes and returns the element at top. Throws exception, if queue is empty.
		
		
		Iterator<Integer> it = q.iterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println();
	}
}
