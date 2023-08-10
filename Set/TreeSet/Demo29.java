import java.util.*;
class Demo29
{
	public static void main(String []arg)
	{
		
		TreeSet t=new TreeSet();
		System.out.println(t.headSet(20));
		System.out.println(t.tailSet(20));
		System.out.println(t.subSet(20,70));
		System.out.println(t.first());
		System.out.println(t.last());
		
	}
}
