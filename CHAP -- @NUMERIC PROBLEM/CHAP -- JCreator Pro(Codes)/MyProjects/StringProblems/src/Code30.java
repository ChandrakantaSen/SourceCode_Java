/*
 * WAP to find and print the frequency of character in a string using method
 * -- void check(String str, char ch)
 */

import java.util.*;

class Code30
{
	Scanner sc = new Scanner(System.in);

	void check(String str, char ch)
	{
		char b;
		int i,len,count=0;

		len = str.length();

		for(i=0; i<len; i++)
		{
			b = str.charAt(i);

			if(b == ch)
			{
				count++;
			}
		}
		System.out.println("Frequency of Character: " + count);
	}

	public static void main (String[] args)
	{
		String st;
		char p;

		Code30 obj = new Code30();

		System.out.println("Enter the String: ");
		st = obj.sc.nextLine();

		System.out.println("Enter the Character: ");
		p = obj.sc.next().charAt(0);

		obj.check(st,p);
	}
}