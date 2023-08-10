import java.util.concurrent.*;
class Demo1
{
	public static void main(String []arg)
	{
		ArrayBlockingQueue q=new ArrayBlockingQueue(3);
		q.add(1);
		q.add(2);
		q.add(3);
		// q.add(4);//IllegalStateException
		System.out.println(q);
		
		
		
	}
}