/**
 * WAP to print the string in its initials format
 */
 
import java.util.*;

class Code6
{
	public static void main (String[] args) 
	{
		String str,word="",initials="";
		char ch;
		int len,i;
		
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
				//System.out.println("Result is: " + word);
				if(word.isEmpty()==false)
				{
					initials = initials + word.charAt(0);
				}
				word="";
			}
		}
		System.out.println("Required String output: " + initials);
	}
}
