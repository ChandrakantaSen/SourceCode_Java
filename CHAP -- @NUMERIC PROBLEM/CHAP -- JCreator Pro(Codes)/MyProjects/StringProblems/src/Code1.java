/**
 * 	WAP to input a string using Scanner class & print it
 */

import java.util.*;

class Code1
{
	public static void main (String[] args)
	{
		String str = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		str = sc.nextLine();
		
		
		System.out.println("String is: " + str);
	}
}