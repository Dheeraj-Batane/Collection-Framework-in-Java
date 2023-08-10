import java.util.concurrent.*;
class Demo7
{
	public static void main(String []arg) throws InterruptedException
	{
		
		ArrayBlockingQueue q=new ArrayBlockingQueue(3);
		q.offer(10);
		q.offer(12);
		q.offer(13);
		q.offer(14,3,TimeUnit.SECONDS);
		
		
		System.out.println(q);

		
		
		
		
	}
}