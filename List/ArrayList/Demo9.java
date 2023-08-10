import java.util.ArrayList;
class Demo9
{
	public static void main(String[] arg)
	{
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		System.out.println(al); // 10 20 30 40
		System.out.println(al.size()); // 4
		
		ArrayList al2=new ArrayList(100);
		System.out.println(al2.size()); //0
		
		
		ArrayList al3=new ArrayList(al);
		System.out.println(al3.size()); // 4
		System.out.println(al3); // 10 20 30 40
		
	}
}