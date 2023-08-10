import java.util.*;

class Demo17
{
	public static void main(String []arg)
	{
		String s[]={"raj","bhanu","rohit","yogesh","dheeraj"};
		TreeSet<String> t=new TreeSet<>();
		for(String s1:s)
		{
			
			t.add(s1);
		}
		
		
		System.out.println(t);
	}
}
