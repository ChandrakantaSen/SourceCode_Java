/**
 * WAP to to reverse the string
 */
 
import java.util.*;

class Code7
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
		System.out.println("Reverse Sting is: " + word);
	}
} 