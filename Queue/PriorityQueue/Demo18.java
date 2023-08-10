import java.util.*;
class Employee implements Comparable
{
	int id;
	String name;
	Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return name;
	}
	public int compareTo(Object o1)
	{
		Employee e1=(Employee)o1;
		// System.out.println(name+"......"+e1.name);
		// return id-e1.id;//1 2 15 5 10
		return name.compareTo(e1.name);//15 5 10 2 1
		// return e1.name.compareTo(name);//15 5 10 2 1
	}
}
class Demo18
{
	public static void main(String []arg)
	{
		

		PriorityQueue q=new PriorityQueue();
		q.offer(new Employee(10,"aman"));
		q.offer(new Employee(5,"gita"));
		q.offer(new Employee(15,"ram"));
		q.offer(new Employee(2,"sita"));
		q.offer(new Employee(1,"bbb"));
		System.out.println(q);
		
	}
}