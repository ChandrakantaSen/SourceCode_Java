/**
 *	WAP to count the number of vowels, consonents & spaces
 */

import java.util.*;

class Code6
{
	public static void main (String[] args)
	{
		String str = "", word = "";
		char ch;
		int len,i,v=0,c=0,s=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		str = sc.nextLine();
		
		len = str.length();
		
		for(i=0;i<len;i++)
		{
			ch = str.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			{
				v++;
			}
			else if(ch == ' ')
			{
				s++;
			}
			else
			{
				c++;
			}
		}
		System.out.println("Vowels are: " + v);
		System.out.println("Consonents are: " + c);
		System.out.println("Spaces are: " + s);
		
	}
}