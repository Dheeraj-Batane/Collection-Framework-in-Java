import java.util.*;

class Demo15
{
	public static void main(String []arg)
	{
		TreeSet<Integer> t=new TreeSet<>((a,b)->a%10==b%10?a%100-b%100:a%10-b%10);
		
		t.add(25);
		t.add(55);
		t.add(28);
		t.add(251);
		t.add(27);
		
		System.out.println(t);
	}
}
