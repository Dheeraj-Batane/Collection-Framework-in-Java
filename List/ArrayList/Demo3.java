import java.util.ArrayList;
class Demo3
{
	public static void main(String[] arg)
	{
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		for(Object o:al)
		{
		System.out.println(o);
		}
	}
}