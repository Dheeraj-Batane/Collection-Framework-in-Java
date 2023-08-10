//only comparable types of data can be stored in TreeSet
//ClassCastException: java.lang.StringBuffer cannot be cast to java.lang.Comparable
import java.util.*;
class Demo6
{
	public static void main(String []arg)
	{
		TreeSet t=new TreeSet();
		t.add(new StringBuffer("ram"));
		t.add(new StringBuffer("sita"));
		t.add(new StringBuffer("gita"));
		t.add(new StringBuffer("abhi"));
		
		
		
		System.out.println(t);
	}
}