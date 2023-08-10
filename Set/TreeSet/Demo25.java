import java.util.*;
class A implements Comparator
{
	
	public int compare(Object o1,Object o2)
	{
		String s1=o1.toString();
		String s2=o2.toString();
		// return s2.compareTo(s1);//[sita, ram, gourav, abhi]
		return s1.compareTo(s2);
	}
	
}
class Demo25
{
	public static void main(String []arg)
	{
		// TreeSet t=new TreeSet(new A());
		TreeSet<StringBuffer> t=new TreeSet<>(new A());
		t.add(new StringBuffer("ram"));
		t.add(new StringBuffer("sita"));
		t.add(new StringBuffer("abhi"));
		t.add(new StringBuffer("gourav"));
		
		System.out.println(t);
	}
}
