import java.util.concurrent.*;
class Demo3
{
	public static void main(String []arg)
	{
		ArrayBlockingQueue q=new ArrayBlockingQueue(5);
		q.add(1);
		q.offer(2);
		q.offer(2);
		q.offer(2);
		q.add(3);
		
		System.out.println(q);
		
		
		
	}
}