import java.util.*;
class A implements Comparator
{
	int sum(int n)
	{
		int s=0;
		int a=0;
		
		while(n!=0)
		{
			a=n%10;
			s=s+a;
			n=n/10;
		}
		return s;
	}
	public int compare(Object o1,Object o2)
	{
		
		int x=(int)o1;	
		int y=(int)o2;	
		
		return sum(x)-sum(y);
		
	}
}
class Demo16
{
	public static void main(String []arg)
	{
		TreeSet t=new TreeSet(new A());
		t.add(25);
		t.add(55);
		t.add(28);
		t.add(251);
		t.add(27);
		
		System.out.println(t);
	}
}
