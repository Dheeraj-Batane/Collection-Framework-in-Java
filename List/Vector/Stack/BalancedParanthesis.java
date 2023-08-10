import java.util.*;
class BalancedParanthesis
{
	public static void main(String []arg)
	{
		Stack st=new Stack();
		// String s=new String("{[()]}");;
		String s[]={"{","[","(","]","}"};
		for(int i=0;i<6;i++)
		{
			if(s[i]=="(" || s[i]=="{" || s[i]=="[")
			{
				st.push(s[i]);
			}
			else if(s[i]==")" || s[i]=="}" || s[i]=="]")
			{
				if(s[i]==")" && st.peek()=="(")
				{
					st.pop();
				}
				else if(s[i]=="}" && st.peek()=="{")
				{
					st.pop();
				}
				else if(s[i]=="]" && st.peek()=="[")
				{
					st.pop();
				}
				else
				{
					
					break;
				}					
			}
		}
		if(st.empty())
			System.out.println("Expression is Balanced");
		else 
			System.out.println("Expression is not Balanced");
		
	}
}