import java.util.*;
import java.util.function.*;
import java.util.stream.*;
class Demo8
{
	public static void main(String arg[])
	{
		ArrayList<Integer> al=new ArrayList<>();
		al.add(12);
		al.add(22);
		al.add(31);
		al.add(14);
		al.add(52);
		al.add(76);
		System.out.println(al);
		
		al.stream().filter(a->a>=18 && a<66).forEach(System.out::println);
		
		
		System.out.println(al);
	}
}