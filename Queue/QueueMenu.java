import java.util.*;
class QueueMenu
{
	public static void main(String []arg)
	{
		Queue q=new LinkedList();
		Scanner sc=new Scanner(System.in);
		int ch=0;
		do
		{
		System.out.println("-----Menu----");
		System.out.println("1.Insert in Queue");
		System.out.println("2.Remove from Queue");
		System.out.println("3.Get first Element Queue");
		System.out.println("4.Display Queue");
		System.out.println("5.Exit");
		System.out.println("--Enter Your Choice--");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
			System.out.println("Enter Element to Insert:");
			int x=sc.nextInt();
			q.offer(x);
			System.out.println("Element Added to Queue");
			System.out.println("----------------------");
			break;
			
			case 2:
			q.remove();
			System.out.println("First Element Removed to Queue");
			System.out.println("----------------------");
			break;
			
			case 3:
			System.out.println("First Element of Queue is :" +q.peek());
			System.out.println("----------------------");
			break;
			
		
			case 4:
			System.out.println(q);
		}

		}while(ch<5);
	}
}