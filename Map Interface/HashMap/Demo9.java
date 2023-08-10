import java.util.*;
class Demo9
{
	public static void main(String []arg)
	{
		HashMap h=new HashMap();
		
		h.put(101,"Ram");
		h.put(93,"Shyam");
		h.put(201,"Sita");
		h.put(11,"Gita");
		
		HashMap h2=new HashMap();
		
		h2.put(101,"Ram");
		h2.put(93,"Shyam");
		h2.put(201,"Sita");
		h2.put(11,"Gita");
		
		HashMap h3=new HashMap();
		
		h3.put(101,"Ram");
		h3.put(93,"Shyam");
		h3.put(201,"Sita");
		h3.put(11,"GitaJi");
		
		System.out.println(h.keySet());
		System.out.println(h2.keySet());
		System.out.println(h3.keySet());
		
		System.out.println(h.values());
		System.out.println(h2.values());
		System.out.println(h3.values());
		
		System.out.println(h.keySet().equals(h2.keySet()));
		System.out.println(h.keySet().equals(h3.keySet()));
		
		System.out.println(h.values().equals(h2.values()));
		System.out.println(h.values().equals(h3.values()));
		
		
		
		
		
	}
}