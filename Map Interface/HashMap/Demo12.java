import java.util.*;
class A
{
	int id;
	A(int id)
	{
		System.out.println("constructor");
		this.id=id;
	}
	// public String toString()
	// {
		// System.out.println("toString");
		// return ""+id;
	// }
	public int hashCode()
	{
		System.out.println("hashCode");
		return id;
		
	}
	// public boolean equals(Object o)
	// {
		// System.out.println("equals");
		// return true;
	// }
}
class Demo12
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