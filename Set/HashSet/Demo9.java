//Program to counting of occurence of all words in a string
import java.util.*;
class Demo9
{
	public static void main(String arg[])
	{
		
		String s="my name is my name ram what your name is";
		String s1[]=s.split(" ");
		
		LinkedHashSet<String> hs=new LinkedHashSet<>();
		for(String s2:s1)
		{
			hs.add(s2);
		}
		int x[]=new int[hs.size()];
		
		System.out.println(s1);
	}
}
