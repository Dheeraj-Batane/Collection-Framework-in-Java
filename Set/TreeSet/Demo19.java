import java.util.*;

class Demo19
{
	public static void main(String []arg)
	{
		TreeSet<String> t=new TreeSet<>((a,b)->b.compareTo(a));
		t.add("ram");
		t.add("sita");
		t.add("gita");
		t.add("aman");
		t.add("bhanu");
		t.add("chunnu");
		t.add("a");
		t.add("aaa");
		t.add("b");
		t.add("aa");
		t.add("aa");
		
		System.out.println(t);
	}
}
