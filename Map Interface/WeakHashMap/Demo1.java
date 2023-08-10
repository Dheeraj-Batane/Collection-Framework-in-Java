import java.util.*;
class A
{
	int x;
	A(int x)
	{
		this.x=x;
	}
	public String toString()
	{
		return ""+x;
	}
	public void finalize()
	{
		System.out.println("Finalize method call");
	}
}
class Demo1
{
	public static void main(String []arg)
	{
		A a1=new A(10);
		A a2=new A(20);
		WeakHashMap h2=new WeakHashMap();
		// HashMap h2=new HashMap();
		
		h2.put(a1,"bbb");
		h2.put(a2,"bbb");
		//h2.put(a1,"bbb");
		//h2.put(a2,"bbb");
		a1=null;
		a2=null;
		System.gc();
		try
		{
		Thread.sleep(1000);	
		System.out.println(h2);
		}
		catch(Exception e)
		{
			
		}
	}
}