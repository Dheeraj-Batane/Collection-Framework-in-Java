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
	public int hashCode()
	{
		return id;
	}
	public boolean equals(Object o)
	{
		if(this==o) return true;
		if(o instanceof Employee)
		{
			Employee e=(Employee)o;
			if(name!=null)
			{
				if(name.equals(e.name))
					return true;
				return false;
			}
			return false;
		}
		return false;
	}
	public String toString()
	{
		return ""+id+"-"+name;
	}
	
}
class Demo21
{
	public static void main(String []arg)
	{
		HashMap h=new HashMap();
		
		//h.put(null,"gita");
		h.put(new Employee(101,"ram"),"dewas");
		h.put(new Employee(102,"ram"),"dewas");
		h.put(new Employee(103,"sita"),"indore");
		h.put(new Employee(101,"sita"),"indore");
		h.put(new Employee(101,"ram"),"indore");
		System.out.println(h);
		
	}
}