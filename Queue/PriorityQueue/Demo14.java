import java.util.*;
class Demo14
{
	public static void main(String []arg)
	{
		

		PriorityQueue<Integer> q=new PriorityQueue<>((a,b)->b-a);
		q.offer(5);
		q.offer(4);
		q.offer(3);
		q.offer(2);

		System.out.println(q);
		PriorityQueue<Integer> q1=new PriorityQueue<>(q);
		System.out.println(q1);

	}
}