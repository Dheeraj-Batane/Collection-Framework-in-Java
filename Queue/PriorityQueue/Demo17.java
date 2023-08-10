//min to max heap 2
import java.util.*;
class Demo17
{
	public static void main(String []arg)
	{
		
		int x[]={1,2,4,5,3};
		for(int i:x)
		System.out.print(i+" ");
		System.out.println();
		
		PriorityQueue<Integer> q2=new PriorityQueue<>((a,b)->b-a);
		for(int j:x)
		{
			q2.offer(j);
		}
		for(int i=0;i<x.length;i++)
		{
		System.out.print(q2.poll()+" ");
		}
	}
}