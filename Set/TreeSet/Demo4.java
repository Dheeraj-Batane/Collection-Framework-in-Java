//heterogenous insertion not possible-- ClassCastException
import java.util.*;
class Demo4
{
	public static void main(String []arg)
	{
		TreeSet t=new TreeSet();
		t.add("ram");
		t.add("sita");
		t.add(10);
		
		System.out.println(t);
	}
}