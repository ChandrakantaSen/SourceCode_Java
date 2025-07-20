/**
 * WAP to reverse the words of the string
 */
 
import java.util.*;
 
class Code8
{
	public static void main (String[] args) 
	{
		String str = "", word = "", rev = "";
		char ch,d;
		int i,j,len,l;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		str = sc.nextLine();
		
		str = str + " ";
		
		len = str.length();
		
		for(i=0;i<len;i++)
		{
			ch = str.charAt(i);
			
			if(ch != ' ')
			{
				word = word + ch;
			}
			else
			{
				l = word.length();
				for(j=(l-1);j>=0;j--)
				{
					d = word.charAt(j);
					rev = rev + d;	
				}
				System.out.print(rev);
				rev = " ";
				word = "";
			}
		}
	}
} 