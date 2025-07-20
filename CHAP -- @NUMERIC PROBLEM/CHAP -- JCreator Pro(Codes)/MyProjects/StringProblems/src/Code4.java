/**
 *	WAP to print the words from a string
 */

import java.util.*;

class Code4
{
	public static void main (String[] args)
	{
		String str = "", word = "";
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
				System.out.println("Words are: " + word);
				word ="";
			}
		}
	}
}