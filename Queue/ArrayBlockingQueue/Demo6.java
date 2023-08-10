import java.util.concurrent.*;
class Demo6
{
	public static void main(String []arg) throws InterruptedException
	{
		
		ArrayBlockingQueue q=new ArrayBlockingQueue(3);
		q.put(1);
		q.put(2);
		q.put(3);
		q.put(4);
		
		System.out.println(q);

		
		
		
		
	}
}