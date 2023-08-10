import java.util.*;
class Demo8
{
	public static void main(String []arg)
	{
		HashMap h=new HashMap();
		
		h.put(101,"Ram");
		h.put(93,"Shyam");
		h.put(201,"Sita");
		h.put(11,"Gita");
		
		h.forEach((k,v)->System.out.println(k+"\t"+v));
		
		// System.out.println(h.values());
		
		
	}
}