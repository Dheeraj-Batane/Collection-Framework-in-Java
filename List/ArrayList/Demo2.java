import java.util.ArrayList;
class Demo2
{
	public static void main(String[] arg)
	{
		ArrayList al=new ArrayList();
		al.add(new Integer(10));
		al.add(new Integer(10));
		for(Object o:al)
		{
		System.out.println(o);
		}
	}
}