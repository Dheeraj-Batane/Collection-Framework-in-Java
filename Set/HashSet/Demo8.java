//Program to print duplicate data using stack
import java.util.*;
class Demo8
{
	public static void main(String arg[])
	{
		Stack st=new Stack();
		String s="my name is ram my name";
		for(String s1:s.split(" "))
		{
			if(st.search(s1)==-1)st.add(s1);
			else
			System.out.println(s1);
		}
	}
}
