import java.util.*;
import java.util.function.*;
import java.util.stream.*;
class Demo10
{
	public static void main(String arg[])
	{
		ArrayList<String> al=new ArrayList<>();
		al.add("aMan");
		al.add("ram");
		al.add("sIta");
		al.add("gita");
		al.add("vArun");
		
		System.out.println(al);
		
		al.stream().filter(a-> a.charAt(1)>=65 && a.charAt(1)<=90 ).forEach(System.out::println);
		
		
		System.out.println(al);
	}
}