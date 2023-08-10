class userHashMap
{
	
	String s[]=new String[100000];
	
	String put(int key,String value)
	{
		String s1=s[key];
		s[key]=value;
		return s1;
	}
	String get(int key)
	{
		return s[key];
	}
	public String toString()
	{
		String s11="{";
		for(int i=0;i<s.length;i++)
		{
			if(s[i]!=null)
			{
				s11=s11+i+"="+s[i]+",";
			}
		}
		s11+="}";
		System.out.println(s11);
		return "";
	}
	
}
class Demo
{
	public static void main(String []arg)
	{
		userHashMap h=new userHashMap();
		h.put(101,"Ram");
		h.put(102,"Shyam");
		h.put(103,"Sita");
		h.put(104,"Gita");
		h.put(105,"Baba Shyam");
		System.out.println(h);
	}
}