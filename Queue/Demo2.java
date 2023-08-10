import java.util.*;
class Demo2
{
	public static void main(String []arg)
	{
		Queue q=new LinkedList();
		
		System.out.println(q.poll());
		// System.out.println(q.remove());
		
		System.out.println(q.offer(10));
		System.out.println(q.offer(20));
		System.out.println(q.offer(30));
		System.out.println(q.offer(40));
		
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q.remove());
		System.out.println(q);
		
		
		
	}
}