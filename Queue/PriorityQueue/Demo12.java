//Program to find kth largest
import java.util.*;

class Demo12
{
	// type-1
	// static public void main(String []arg)
	// {
		// PriorityQueue p=new PriorityQueue();
		// // int x[]={3,2,1,5,6,4};
		// int x[]={3,2,3,1,2,4,5,5,6};
		// int k=4;
		// for(int i:x)
		// {
			// p.offer(i);
		// }
		
		// int m=p.size();
		// for(int i=0;i<m;i++)
		// {
			// x[i]=(int)p.poll();
		// System.out.print(x[i]+" ");
		// }
		// System.out.println();
		
		// int p1=x.length-k;
		// System.out.println(x[p1]);
	// }
	// type-2
	public static void main(String []arg)
	{
		PriorityQueue p=new PriorityQueue();
		// int x[]={3,2,1,5,6,4};
		int x[]={1,2,3,4,5,6,7,8,9};
		int k=1;
		
		for(int i:x)
		{
			p.offer(i);
			while(p.size()>k)p.poll();
		}
		System.out.println(p.peek());
	}
	
}