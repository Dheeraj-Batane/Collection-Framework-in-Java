import java.util.*;
class Demo3
{
	public static void main(String []arg)
	{

		// WeakHashMap h1=new WeakHashMap();
		// HashMap h1=new HashMap();
		IdentityHashMap h1=new IdentityHashMap();
		
		h1.put("ram","aaa");
		h1.put("AAA","aaa");
		h1.put("abhi","aaa");
		
		
		
		System.gc();
		try
		{
		Thread.sleep(1000);	
		}
		catch(Exception e)
		{
			
		}
		System.out.println(h1);
		
	}
}