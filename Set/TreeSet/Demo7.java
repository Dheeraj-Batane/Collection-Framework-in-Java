//only comparable types of data can be stored in TreeSet
//ClassCastException: Employee cannot be cast to Comparable
import java.util.*;

class Employee
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
	
	
}
class Demo7
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