import java.util.*;
class Demo19
{
	public static void main(String []arg)
	{
		

		PriorityQueue<String> q=new PriorityQueue<>();
		q.offer("aman");
		q.offer("ram");
		q.offer("sita");
		q.offer("aakash");
		q.offer("jeevan");
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());

		
	}
}