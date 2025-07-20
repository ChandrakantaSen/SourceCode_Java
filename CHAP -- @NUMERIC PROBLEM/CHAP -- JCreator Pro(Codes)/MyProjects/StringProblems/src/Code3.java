/**
 *	WAP to print the individual characters of a string
 */
 
import java.util.*;

class Code3
{
	public static void main (String[] args)
	{
		String str = "";
		int len, i;
		char ch;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		str = sc.nextLine();
		
		len = str.length();
		
		for(i=0;i<len;i++)
		{
			ch = str.charAt(i);	
			System.out.println("Characters are: " + ch);
		}
		
	}
}