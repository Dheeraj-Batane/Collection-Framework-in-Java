import java.util.*;
class Demo6
{
	public static void main(String []arg)
	{
		PriorityQueue pq=new PriorityQueue();
		for(int i=11;i>0;i--)
		pq.offer(i);
		
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
	}
}