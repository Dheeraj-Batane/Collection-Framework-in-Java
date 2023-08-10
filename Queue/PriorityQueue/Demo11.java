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
class Demo11
{
	static public void main(String []arg)
	{
		PriorityQueue pq=new PriorityQueue(new A());
		pq.offer(1);
		pq.offer(2);
		pq.offer(3);
		pq.offer(4);
		pq.offer(5);
		System.out.println(pq);
		
	}
}