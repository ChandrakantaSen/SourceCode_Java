/**
 * WAP to check a string is Palindrome or not 
 */
 
import java.util.*;
 
class Code9
{
		public static void main (String[] args) 
	{
		String str = "", word = "";		
		char ch;
		int i,len;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		str = sc.nextLine();
		
		len = str.length();
		
		for(i=(len-1);i>=0;i--)
		{
			ch = str.charAt(i);
			word = word + ch;
		}
		
		if(str.compareTo(word) == 0)
		{
			System.out.println("Palindrome String");
		}
		else
		{
			System.out.println("Not Palindrome String");
		}
	}
} 