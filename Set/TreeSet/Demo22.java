import java.util.*;
class A implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		int x=(int)o1;
		int y=(int)o2;
		return y-x;
	}
}
class Demo22
{
	public static void main(String []arg)
	{
		TreeSet t=new TreeSet(new A());
		t.add(5);
		t.add(10);
		t.add(2);
		t.add(1);
		
		System.out.println(t);
	}
}
