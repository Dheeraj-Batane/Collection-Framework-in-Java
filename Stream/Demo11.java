import java.util.*;
import java.util.function.*;
import java.util.stream.*;
class Demo11
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
		Collections.sort(al);
		
		System.out.println(al);
		long x=al.stream().count();
		System.out.println(x);
		
		
	}
}