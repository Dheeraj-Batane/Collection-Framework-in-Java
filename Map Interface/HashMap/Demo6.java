import java.util.*;
class Demo6
{
	public static void main(String []arg)
	{
		HashMap h=new HashMap();
		
		h.put(101,"Ram");
		h.put(93,"Shyam");
		h.put(201,"Sita");
		h.put(11,"Gita");
		
		System.out.println(h.keySet());
		System.out.println(h.values());
		
		
	}
}