import java.util.*;
import java.util.function.*;
import java.util.stream.*;
class Demo9
{
	public static void main(String arg[])
	{
		ArrayList<String> al=new ArrayList<>();
		al.add("aman");
		al.add("ram");
		al.add("sita");
		al.add("gita");
		al.add("varun");
		
		System.out.println(al);
		
		al.stream().filter(a-> a.startsWith("a") || a.endsWith("a") ).forEach(System.out::println);
		
		
		System.out.println(al);
	}
}