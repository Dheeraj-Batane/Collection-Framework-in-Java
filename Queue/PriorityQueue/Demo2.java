import java.util.*;
class Demo2
{
	public static void main(String []arg)
	{
		PriorityQueue pq=new PriorityQueue();
		pq.offer(50);
		pq.offer(40);
		pq.offer(30);
		pq.offer(20);
		pq.offer(10);
		System.out.println(pq);
	}
}