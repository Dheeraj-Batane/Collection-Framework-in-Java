import java.util.*;
class Demo1
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
		ArrayList<Integer> al2=new ArrayList<>();
		for(int i:al)
		{
			if(i%2==0)
			al2.add(i);
		}
		System.out.println(al2);
		
		
	}
}