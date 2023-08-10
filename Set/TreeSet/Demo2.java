import java.util.*;
class Demo2
{
	public static void main(String []arg)
	{
		TreeSet t=new TreeSet();
		t.add(10);
		t.add(10);
		//duplicate insertion not possible
		System.out.println(t);
	}
}