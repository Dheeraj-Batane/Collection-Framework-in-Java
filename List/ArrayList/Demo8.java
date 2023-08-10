import java.util.ArrayList;
class Demo8
{
	public static void main(String[] arg)
	{
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(20);
		System.out.println(al); // 10 20 30 40 20
		
		al.add(2,25);
		System.out.println(al);// 10 20 25 30 40 20
		
		al.set(2,55);
		System.out.println(al); //10 20 55 30 40 20
		
		System.out.println(al.set(3,22)); //30
		
		
		al.remove(new Integer(50));
		System.out.println(al);//10 20 55 30 40 20
		
		al.remove(4);
		System.out.println(al);// 10 20 55 30 20 
		
		System.out.println(al.get(1));//20
		
		System.out.println(al.indexOf(20));//1
		
		System.out.println(al.lastIndexOf(20));//4
		
		System.out.println(al.lastIndexOf(200)); //-1
		
		System.out.println(al.subList(2,5));// 55 30 40
		
		System.out.println(al.subList(5,5));//[]
		
		System.out.println(al.subList(5,2));//IllegalArgumentException
		
		//System.out.println(al.subList(5,10)); Exception
	}
}