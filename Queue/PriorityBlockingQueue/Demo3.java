import java.util.concurrent.*;
class Demo3
{
	public static void main(String []arg)
	{
		PriorityBlockingQueue q=new PriorityBlockingQueue();
		for(int i=1;i<=2147483647;i++)
		{
		q.offer(i);
		}
		
		System.out.println(q);
	}
}