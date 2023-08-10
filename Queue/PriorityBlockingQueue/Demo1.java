import java.util.concurrent.*;
class Demo1
{
	public static void main(String []arg)
	{
		PriorityBlockingQueue q=new PriorityBlockingQueue();
		q.offer(1);
		q.offer(2);
		q.offer(3);
		q.offer(3);
		// q.offer(null);
		System.out.println(q);
	}
}