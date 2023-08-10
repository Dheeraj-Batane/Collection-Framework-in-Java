import java.util.*;

class Demo5
{
	public static void main(String []arg)
	{
		TreeMap<Integer,String> h=new TreeMap<>((a,b)->b-a);
		h.put(10,"ram");
		h.put(1,"ji");
		h.put(15,"aaa");
		h.put(5,"bbb");
		h.put(2,"ccc");
		
		
		System.out.println(h);
	}
}