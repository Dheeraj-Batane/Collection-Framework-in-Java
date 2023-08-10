import java.util.*;
class Employee implements Comparable
{
	private int id;
	Employee(int id)
	{
		this.id=id;
	}
	public int compareTo(Object o1)
	{
		return 1;
	}
	public String toString()
	{
		return ""+id;
	}
}
class Demo24
{
	public static void main(String []arg)
	{
		TreeSet t=new TreeSet((a,b)->-1);
		t.add(new Employee(10));
		t.add(new Employee(5));
		t.add(new Employee(12));
		t.add(new Employee(15));
		t.add(new Employee(8));
		System.out.println(t);
	}
}
