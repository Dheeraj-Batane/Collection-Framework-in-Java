import java.util.*;
class A implements Comparator
{
	static int c=0;
	public int compare(Object o1,Object o2)
	{
		c++;
		int x=(int)o1;	
		int y=(int)o2;	
		// return x%10==y%10?x%100-y%100:x%10-y%10;
		return x%100-y%100;
	}
}
class Demo12
{
	public static void main(String []arg)
	{
		TreeSet t=new TreeSet(new A());
		t.add(25);
		t.add(55);
		t.add(28);
		t.add(251);
		t.add(27);
		
		
		
		System.out.println(A.c);
		System.out.println(t);
	}
}
