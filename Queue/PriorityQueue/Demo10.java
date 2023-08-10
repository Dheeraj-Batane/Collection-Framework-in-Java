import java.util.*;
class A implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		int x=(int)o1;
		int y=(int)o2;
		System.out.println(x+"...compare with..."+y);
		// return x-y;
		
		return y-x;
		
	}
}
class Demo10
{
	public static void main(String []arg)
	{
		PriorityQueue pq=new PriorityQueue(new A());
		pq.offer(5);
		pq.offer(4);
		pq.offer(3);
		pq.offer(2);
		pq.offer(1);
		System.out.println(pq);
		
	}
}