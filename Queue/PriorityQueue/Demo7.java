import java.util.*;
class A 
{
	public int compare(Object o1,Object o2)
	{
		return 1;
	}
}
class Demo7
{
	public static void main(String []arg)
	{
		PriorityQueue pq=new PriorityQueue();
		pq.offer(1);
		pq.offer("ram");
		System.out.println(pq);
		
	}
}