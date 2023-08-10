import java.util.*;
class A implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		return 1;
	}
}
class Demo21
{
	public static void main(String []arg)
	{
		TreeSet t=new TreeSet(new A());
		t.add(new StringBuffer("Ram"));
		t.add(new StringBuffer("Sita"));
		t.add(new StringBuffer("Abhi"));
		t.add(new StringBuffer("Dheeraj"));
		
		System.out.println(t);
	}
}
