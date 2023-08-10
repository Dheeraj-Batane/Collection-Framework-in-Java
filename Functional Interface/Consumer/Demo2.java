import java.util.function.*;
class Demo2
{
	public static void main(String []arg)
	{
		Consumer i=a->System.out.println("hii..."+a+"ji");
		i.accept("Ram");
		i.accept("Sita");
		i.accept("Gita");
	}
	
}