import java.util.concurrent.*;
class Demo4
{
	public static void main(String []arg)
	{
		ArrayBlockingQueue q=new ArrayBlockingQueue(3);

		q.offer(1);
		q.offer(2);
		q.offer(3);
		q.offer(4);
		
		System.out.println(q);

		
		
		
		
	}
}