// Program to count and print unique word from string using HashSet
import java.util.*;
class Demo4
{
	public static void main(String arg[])
	{
		String s1="my name is ram is ram my name";
		HashSet hs=new HashSet();
		for(String c:s1.split(" "))
		{
		hs.add(c);
		}
		System.out.println(hs);//print unique character
		System.out.println(hs.size());//No of unique Character
	}
}
