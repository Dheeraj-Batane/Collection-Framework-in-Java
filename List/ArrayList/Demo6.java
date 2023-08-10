import java.util.ArrayList;
class Demo6
{
	public static void main(String[] arg)
	{
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(null);
		
		for(int o:al)/// NullPointerException when null is converted to int
		{
		System.out.println(o);
		}
	}
}