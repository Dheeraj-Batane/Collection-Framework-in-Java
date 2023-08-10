import java.util.*;
class Employee
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
		return ""+id+"\t"+name;
	}
}
class B implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		return e1.id-e2.id;
	}
}
class Demo20
{
	public static void main(String []arg)
	{
		
		PriorityQueue q=new PriorityQueue(new B());
		// PriorityQueue<Employee> q=new PriorityQueue<>((e1,e2)->e1.id-e2.id);
		q.offer(new Employee(12,"ram"));
		q.offer(new Employee(15,"sita"));
		q.offer(new Employee(1,"gita"));
		q.offer(new Employee(16,"ajay"));
		q.offer(new Employee(4,"vijay"));
		System.out.println(q);

		
	}
}