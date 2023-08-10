import java.util.*;
class Demo16
{
	public static void main(String []arg)
	{
		

		PriorityQueue<Integer> q1=new PriorityQueue<>();
		q1.offer(5);
		q1.offer(4);
		q1.offer(3);
		q1.offer(2);
		q1.offer(1);
		System.out.println(q1);
		
		PriorityQueue<Integer> q2=new PriorityQueue<>((a,b)->b-a);
		for(int i:q1)
		{
			q2.offer(i);
		}
		System.out.println(q2);
	}
}