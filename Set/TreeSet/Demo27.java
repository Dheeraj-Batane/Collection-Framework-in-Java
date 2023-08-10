import java.util.*;
class A implements Comparator<StringBuffer>
{
	
	public int compare(StringBuffer o1,StringBuffer o2)
	{
		String s1=o1.toString();
		String s2=o2.toString();
		// return s2.compareTo(s1);
		return s1.compareTo(s2);// 1 10  15 20
	}
	
}
class Demo27
{
	public static void main(String []arg)
	{
		// TreeSet t=new TreeSet(new A());
		TreeSet<StringBuffer> t=new TreeSet<>(new A());
		t.add(new StringBuffer("10"));
		t.add(new StringBuffer("4"));
		t.add(new StringBuffer("15"));
		t.add(new StringBuffer("20"));
		t.add(new StringBuffer("1"));
		
		System.out.println(t);
	}
}
