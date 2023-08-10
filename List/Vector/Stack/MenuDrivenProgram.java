import java.util.*;
class MenuDrivenProgram 
{
	public static void main(String []arg)
	{
		Scanner sc=new Scanner(System.in);
		Stack st=new Stack();
		int ch;
		do
		{
			System.out.println("-------Stack Menu------");
			System.out.println("1.Display Stack");
			System.out.println("2.Push Data");
			System.out.println("3.Pop Data");
			System.out.println("4.Peek Element of Stack");
			System.out.println("5.Check statck is empty or not");
			System.out.println("6.Search");
			System.out.println("7.Exit");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
				System.out.println("Stack------->");
				System.out.println(st);
				break;
				
				case 2:
				System.out.println("Enter Data to Push");
				int x=sc.nextInt();
				st.push(x);
				System.out.println(st);
				break;
				
				case 3:
				System.out.println("Popped Element is "+st.pop());
				System.out.println("Current Stack");
				System.out.println(st);
				break;
				
				case 4:
				System.out.println("Peek Element is "+st.peek());
				break;
				
				case 5:
				if(st.empty())
				System.out.println("Stack is Empty");
				else
				System.out.println("Stack is Not Empty");
				break;
				
				case 6:
				System.out.println("Enter Data to Search");
				int x1=sc.nextInt();
				int y=st.search(x1);
				if(y==-1)
				System.out.println("Data Not Found");
				else
				System.out.println("Data is available at index "+y);
				break;
			}
			
		}while(ch<7);
		
	}
}