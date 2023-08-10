import java.util.*;

class Demo1
{
	public static void main(String []arg)
	{
		IdentityHashMap h=new IdentityHashMap();
		String s1=new String("ram");
		String s2=new String("ram");
		h.put(s1,"aaa");
		h.put(s2,"bbb");
		
		
		System.out.println(h);
	}
}