import java.util.*;
import java.util.function.*;
import java.util.stream.*;
class Demo144
{
	public static void main(String arg[])
	{
		ArrayList<Integer> al=new ArrayList<>();
		for(int k=100;k<1000;k++)
		{
		al.add(k);
		}
		//System.out.println(al);
		// List li2=al.stream().filter(i->i%2==0).collect(Collectors.toList());
		// al.stream().filter(i->i%2==0).forEach(System.out::println);
		Stream<Integer> s=al.stream();
		//Predicate<Integer> p=a->a%2==0;
		Predicate<Integer> p1=new Predicate<Integer>()
		{
			public boolean test(Integer i)
			{
				for(int j=2;j<i;j++)
				{
					if(i%j==0)
						return false;
				}
				return true;
			}
		};
		Predicate<Integer> p2=new Predicate<Integer>()
		{
			public boolean test(Integer i)
			{
				int n=i;
				int a=0;
				int s=0;
				while(i!=0)
				{
					a=i%10;
					s=s*10+a;
					i=i/10;
				}
				if(n==s)return true;
				
				return false;
			}
		};
		Predicate<Integer> p=p1.and(p2);
		
		
		s.filter(p).forEach(System.out::println);
		
		
	}
}