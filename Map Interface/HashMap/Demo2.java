import java.util.*;
class Demo2
{
	public static void main(String []arg)
	{
		HashMap h=new HashMap();
		System.out.println(h.remove(101));
		h.put(101,"Ram");
		h.put(93,"Shyam");
		h.put(201,"Sita");
		h.put(11,"Gita");
		
		System.out.println(h.remove(101));
	}
}