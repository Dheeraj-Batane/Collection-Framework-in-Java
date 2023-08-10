import java.util.*;
class Demo28
{
	public static void main(String []arg)
	{
		
		TreeSet t=new TreeSet();
		t.add(100);
		t.add(10);
		t.add(20);
		t.add(30);
		t.add(50);
		t.add(70);
		System.out.println(t);
		System.out.println(t.first());
		System.out.println(t.last());
		System.out.println(t.headSet(20));
		System.out.println(t.tailSet(20));
		System.out.println(t.subSet(20,70));
		
	}
}
