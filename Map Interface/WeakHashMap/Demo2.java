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
class Demo2
{
	public static void main(String []arg)
	{
		A a1=new A(10);
		A a2=new A(10);
		WeakHashMap h1=new WeakHashMap();
		HashMap h2=new HashMap();
		IdentityHashMap h3=new IdentityHashMap();
		
		h1.put(a1,"aaa");
		
		h2.put(a1,"aaa");
		
		h3.put(a1,"aaa");
		
		
		a1=null;
		a2=null;
		System.gc();
		try
		{
		Thread.sleep(1000);	
		System.out.println(h1);
		}
		catch(Exception e)
		{
			
		}
		System.out.println(h2);
		System.out.println(h3);
	}
}