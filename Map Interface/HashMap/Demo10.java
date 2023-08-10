import java.util.*;
class A
{
	int id;
	A(int id)
	{
		System.out.println("constructor");
		this.id=id;
	}
	public String toString()
	{
		System.out.println("toString");
		return ""+id;
	}
	public int hashCode()
	{
		System.out.println("hashCode");
		return id;
		
	}
	public boolean equals(Object o)
	{
		System.out.println("equals");
		return true;
	}
}
class Demo10
{
	public static void main(String []arg)
	{
		HashMap h=new HashMap();
		
		h.put(new A(101),"Ram");
		h.put(new A(102),"Sita");
		h.put(new A(103),"Gita");
	h.forEach((k,v)->System.out.println(k+"\t"+v));
		// System.out.println(h);
		
		
		
		
		
	}
}