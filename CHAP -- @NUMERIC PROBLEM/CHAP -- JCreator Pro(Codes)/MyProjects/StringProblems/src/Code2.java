/**
 * 	WAP to find the length of a string
 */

import java.util.*;

class Code2
{
	public static void main (String[] args)
	{
		String str = "";
		int len;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		str = sc.nextLine();
		
		len = str.length();
		
		System.out.println("Length of the String is: " + len);
	}
}