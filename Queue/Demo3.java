import java.util.*;
class Demo3
{
	public static void main(String []arg)
	{
		Queue q=new LinkedList();
		
		System.out.println(q.peek());
		// System.out.println(q.element());
		
		q.offer(10);
		q.offer(21);
		q.offer(40);
		q.offer(12);
		q.offer(11);
		
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.element());
		System.out.println(q);

		
		
		
	}
}