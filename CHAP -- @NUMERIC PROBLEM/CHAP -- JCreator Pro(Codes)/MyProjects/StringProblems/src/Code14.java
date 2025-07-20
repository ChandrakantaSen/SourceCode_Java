/*
 * WAP to find the longest word in string
 */
 
import java.util.*;

class Code14
{
	public static void main (String[] args)
	{
		String str = "", word = "", maxWrd = "";
		char ch = ' ';
		int i, len, wlen, max = 0;
		
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
				wlen = word.length();
				if(wlen >= max)
				{
					max = wlen;
					maxWrd = word;
				}
				word = "";
			}
		}
		System.out.println("Required String is: " + maxWrd);
		System.out.println("It's length is: " + max);
	}
}