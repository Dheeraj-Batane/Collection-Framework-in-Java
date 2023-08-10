//null insertion not possible -- NullPointerException
import java.util.*;
class Demo5
{
	public static void main(String []arg)
	{
		TreeSet t=new TreeSet();
		t.add("ram");
		t.add(null);
		
		
		System.out.println(t);
	}
}