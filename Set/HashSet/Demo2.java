 // Program to count and print unique character from string using HashSet
import java.util.*;
class Demo2
{
	public static void main(String arg[])
	{
		String s="aaaabbbccccddddswewsss";
		HashSet hs=new HashSet();
		for(char c:s.toCharArray())
		{
			hs.add(c);
		}
		// for(int 0;i<s.length();i++)
		// {
			// hs.add(s.charAt(i));
		// }
		System.out.println(hs);//print unique character
		System.out.println(hs.size());//No of unique Character
	}
}
