import java.util.*;
class Demo6
{
	public static void main(String arg[])
	{
		HashSet hs=new HashSet();
		String s="my name is ram my name";
		for(String s1:s.split(" "))
		{
			if(!hs.add(s1))
		System.out.println(s1);
		}
	}
}
