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
		return false;
	}
}

class Demo13
{
	public static void main(String []arg)
	{
		HashMap h=new HashMap();
		
		h.put(new A(101),"aaa");
		h.put(new A(102),"bbb");
		h.put(new A(101),"ccc");
	
		System.out.println(h.get(new A(101)));
		
		
		
		
		
		
	}
}