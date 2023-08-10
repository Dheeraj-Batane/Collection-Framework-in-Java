//Program to find kth largest
// kth largest element of array
import java.util.*;
// class Demo13
// {
	
	// public static void main(String []arg)
	// {
		// PriorityQueue p=new PriorityQueue();
		// // int x[]={3,2,1,5,6,4};
		// int x[]={1,2,3,4,5,6,7,8,9};
		// int k=4;
		
		// for(int i:x)
		// {
			// p.offer(i);
			// if(p.size()>k)p.poll();
		// }
		// System.out.println(p.peek());
	// }
	
// }
//check array is min heap or not
class Demo13
{
	public static void main(String []arg)
	{
		
		int x[]={1,2,13,4,5,6,7,8,9};
		PriorityQueue<Integer> q=new PriorityQueue<>();
		for(int i:x)
		{
			q.offer(i);
		}
		int j=0;
		for(int i:q)
		{
			if(i!=x[j++])break;
		}
		if(j==x.length)
			System.out.println("Array is min heap");
		else
			System.out.println("Array is not min heap");
	}
}