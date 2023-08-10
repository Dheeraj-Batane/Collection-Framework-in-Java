import java.util.*;
class Demo30
{
	public static void main(String []arg)
	{
		
		TreeSet t=new TreeSet();
		System.out.println(t.pollFirst());
		System.out.println(t.pollLast());
		t.add(4);
		t.add(8);
		t.add(9);
		t.add(15);
		System.out.println(t.pollFirst());
		System.out.println(t.pollLast());
		
	}
}
