import java.util.*;
import java.util.function.*;
import java.util.stream.*;
class Demo12
{
	public static void main(String arg[])
	{
		ArrayList<String> al=new ArrayList<>();
		al.add("");
		al.add("a");
		al.add("aman");
		al.add("");
		al.add("abhi");
		al.add("");
		// al.add("shyam");
		// al.add("");
		
		System.out.println(al);
		
		// long x=al.stream().filter(a->a.length()==0).count();
		long x=al.stream().filter(a-> !a.isEmpty()).count();
		System.out.println(x);
		
		
	}
}