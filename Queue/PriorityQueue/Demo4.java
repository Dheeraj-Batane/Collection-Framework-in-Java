import java.util.*;
class Demo4
{
	public static void main(String []arg)
	{
		PriorityQueue pq=new PriorityQueue();
		
		pq.offer(new StringBuffer("ram"));
		pq.offer(new StringBuffer("sita"));
		
		System.out.println(pq);
	}
}