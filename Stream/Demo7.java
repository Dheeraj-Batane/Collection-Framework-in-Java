import java.util.*;
import java.util.function.*;
import java.util.stream.*;
class Demo7
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
		Predicate<Integer> p=new Predicate<Integer>(){
			public boolean test(Integer i)
			{
				if(i%2==0)
					return true;
				else
					return false;
				
			}
		};
		
		al.stream().filter(p).forEach(System.out::println);
		
		
		System.out.println(al);
	}
}