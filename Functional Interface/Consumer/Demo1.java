import java.util.function.*;
interface Inter1<T>
{
	void accept(T t);
}
class Demo1
{
	public static void main(String []arg)
	{
		Inter1 i=a->System.out.println("hii..."+a+"ji");
		i.accept("Ram");
		i.accept("Sita");
		i.accept("Gita");
	}
	
}