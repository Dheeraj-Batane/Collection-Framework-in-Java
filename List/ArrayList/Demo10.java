import java.util.ArrayList;
class Demo10
{
	public static void main(String[] arg)
	{
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al); // 10 20 30 40 50
		
		ArrayList al2=new ArrayList(al);
		System.out.println(al2); // 10 20 30 40 50
		al2.add(60);
		al2.add(70);
		al2.add(80);
		
		System.out.println(al); // 10 20 30 40 50
		System.out.println(al2); // 10 20 30 40 50 60 70 80 
		
		al.add(2,55);
		System.out.println(al); // 10 20 30 40 50
		System.out.println(al2); // 10 20 30 40 50 60 70 80 
		
	}
}