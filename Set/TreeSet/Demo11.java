import java.util.*;
class A implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		int x=(int)o1;	
		int y=(int)o2;	
		return x%10==y%10?x%100-y%100:x%10-y%10;
	}
}
class Demo11
{
	public static void main(String []arg)
	{
		TreeSet t=new TreeSet(new A());
		t.add(55);
		t.add(25);
		t.add(23);
		t.add(27);
		t.add(21);
		
		
		
		System.out.println(t);
	}
}
