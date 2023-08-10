import java.util.concurrent.*;
class Demo2
{
	public static void main(String []arg)
	{
		PriorityBlockingQueue q=new PriorityBlockingQueue();
		System.out.println(q.remainingCapacity());
		q.offer(1);
		q.offer(2);
		q.offer(3);
		q.offer(3);
		// q.offer(null);
		System.out.println(q.remainingCapacity());
		System.out.println(q);
	}
}