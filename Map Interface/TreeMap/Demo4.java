import java.util.*;
class A implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		int x=(Integer)o1;
		int y=(Integer)o2;
		return y-x;
	}
}
class Demo4
{
	public static void main(String []arg)
	{
		TreeMap h=new TreeMap(new A());
		h.put(10,"ram");
		h.put(1,"ji");
		h.put(15,"aaa");
		h.put(5,"bbb");
		h.put(2,"ccc");
		
		
		System.out.println(h);
	}
}