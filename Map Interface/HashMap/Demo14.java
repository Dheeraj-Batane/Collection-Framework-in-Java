import java.util.*;
class Employee
{
	int id;
	Employee(int id)
	{
		// SysQtem.out.println("constructor");
		this.id=id;
	}
	public String toString()
	{
		// System.out.println("toString");
		return ""+id;
	}
	public int hashCode()
	{
		// System.out.println("hashCode");
		return id;
		
	}
	public boolean equals(Object o)
	{
		// System.out.println("equals");
		// return false;
		return true;
	}
}
class Students
{
	int id;
	Students(int id)
	{
		// SysQtem.out.println("constructor");
		this.id=id;
	}
	public String toString()
	{
		// System.out.println("toString");
		return ""+id;
	}
	public int hashCode()
	{
		// System.out.println("hashCode");
		return id;
		
	}
	public boolean equals(Object o)
	{
		// System.out.println("equals");
		// return false;
		return true;
	}
}
class Demo14
{
	public static void main(String []arg)
	{
		HashMap h=new HashMap();
		
		h.put(new Employee(101),"aaa");
		h.put(new Employee(102),"bbb");
		h.put(new Students(101),"ccc");
	
		System.out.println(h);
		System.out.println(h.get(new Students(101)));
		System.out.println(h.get(new Employee(101)));
	}
}