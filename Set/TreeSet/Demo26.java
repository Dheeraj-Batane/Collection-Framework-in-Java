import java.util.*;
class A implements Comparator
{
	
	public int compare(Object o1,Object o2)
	{
		String s1=o1.toString();
		String s2=o2.toString();
		return s2.compareTo(s1);
		// return s1.compareTo(s2);// 1 10  15 20
	}
	
}
class Demo26
{
	public static void main(String []arg)
	{
		// TreeSet t=new TreeSet(new A());
		TreeSet<StringBuffer> t=new TreeSet<>(new A());
		t.add(new StringBuffer("10"));
		t.add(new StringBuffer("1"));
		t.add(new StringBuffer("15"));
		t.add(new StringBuffer("20"));
		
		System.out.println(t);
	}
}
