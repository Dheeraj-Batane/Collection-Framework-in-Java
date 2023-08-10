import java.util.*;
class Demo3
{
	public static void main(String []arg)
	{
		HashMap h=new HashMap();
		System.out.println(h.containsKey(101));
		System.out.println(h.containsValue("ram"));
		h.put(101,"Ram");
		h.put(93,"Shyam");
		h.put(201,"Sita");
		h.put(11,"Gita");
		
		System.out.println(h.containsKey(101));
		System.out.println(h.containsValue("ram"));
	}
}