import java.util.*;
class Demo31
{
	public static void main(String []arg)
	{
		
		TreeSet t=new TreeSet();
		System.out.println(t.lower(8));
		System.out.println(t.higher(8));
		t.add(4);
		t.add(8);
		t.add(9);
		t.add(15);
		System.out.println(t.lower(8));
		System.out.println(t.higher(8));
		
		
	}
}
