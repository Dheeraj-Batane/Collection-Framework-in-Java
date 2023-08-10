import java.util.*;
class Demo22
{
	public static void main(String []arg)
	{
		HashMap h=new HashMap();
		h.put(101,"aaa");
		h.put(102,"bbb");
		h.put(103,"ccc");
		h.put(104,"ddd");
		
		HashMap h2=new HashMap();
		h2.put(1001,"aaa");
		h2.put(1002,"bbb");
		h2.put(1003,"ccc");
		h2.put(1004,"ddd");
		
		h.putAll(h2);
		System.out.println(h);
		System.out.println(h2);
		
	}
}