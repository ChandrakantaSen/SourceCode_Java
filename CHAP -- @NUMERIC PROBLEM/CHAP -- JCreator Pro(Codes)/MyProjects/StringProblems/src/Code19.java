/*
 * String Pattern - III (Half Pyramid)
 	C
 	C O
 	C O M
 	C O M P
 	C O M P U
 	C O M P U T
 	C O M P U T E
 	C O M P U T E R
 */

import java.util.*;

class Code19
{
	public static void main (String[] args)
	{
		String str,str1="";
		int len,i;
		char b;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		str = sc.nextLine();

		len = str.length();

		for(i=0; i<len; i++)
		{
			b = str.charAt(i);

			str1 = str1 + b;
			System.out.println(str1);
		}
	}
}
