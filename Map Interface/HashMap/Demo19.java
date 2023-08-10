import java.util.*;
class Demo19
{
	public static void main(String []arg)
	{
		String s1="Ea";
		String s2=new String("abc");
		String s3=new String("FB");
		
		System.out.println(s1.hashCode());
		s1="ram";
		System.out.println(s1.hashCode());
		
	}
}