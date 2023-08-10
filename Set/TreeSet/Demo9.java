import java.util.*;
class Employee implements Comparable
{
	int id;
	Employee(int id)
	{
		this.id=id;
	}
	public String toString()
	{
		return ""+id;
	}
	public int compareTo(Object o)
	{
		//return -1; [103, 102, 101, 100]
		//return 1;  [100, 101, 102, 103]
		//return 0;	 [100]
		Employee e=(Employee)o;
		//return id-e.id; [100, 101, 102, 103]
		return e.id-id;   [103, 102, 101, 100]
	} 	
}
class Demo9
{
	public static void main(String []arg)
	{
		TreeSet t=new TreeSet();
		t.add(new Employee(100));
		t.add(new Employee(101));
		t.add(new Employee(102));
		t.add(new Employee(103));
		
		
		
		System.out.println(t);
	}
}
