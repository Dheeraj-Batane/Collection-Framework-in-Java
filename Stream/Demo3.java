import java.util.*;
import java.util.stream.*;
class Demo3
{
	public static void main(String arg[])
	{
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		System.out.println(al);
		// List li2=al.stream().filter(i->i%2==0).collect(Collectors.toList());
		al.stream().filter(i->i%2==0).forEach(System.out::println);
		
		
		
	}
}