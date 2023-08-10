// Program to count and print unique character from string using HashSet
import java.util.*;
class Demo3
{
	public static void main(String arg[])
	{
		String s1="aaaaabbbbcccdddffccddsss";
		HashSet hs=new HashSet();
		for(char c:s1.toCharArray())
		{
		hs.add(c);
		}
		System.out.println(hs);//print unique character
		System.out.println(hs.size());//No of unique Character
	}
}
