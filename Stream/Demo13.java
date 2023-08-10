import java.util.*;
import java.util.function.*;
import java.util.stream.*;
class Demo13
{
	public static void main(String arg[])
	{
		ArrayList<String> al=new ArrayList<>();
		
		al.add("aman");
		al.add("raj");
		al.add("aakash");
		al.add("parash");
		al.add("jai");
		al.add("jeevan");
		al.add("karishma");
		al.add("sakshi");
		
		System.out.println(al);
		
		// long x=al.stream().filter(a->a.length()==0).count();
		al.stream().filter(a-> a.length()>3).sorted().forEach(System.out::println);
		
		
		
	}
}