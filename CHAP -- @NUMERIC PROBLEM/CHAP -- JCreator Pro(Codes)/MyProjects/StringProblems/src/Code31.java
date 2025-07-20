/*
 * WAP to display only vowels after converting a string into lowercase using method
 * -- void check(String str)
 */

 import java.util.*;

 class Code31
 {
	public static void main (String[] args)
	{
		String str;
		char b,j;
		int i,len,count=0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		str = sc.nextLine();

		len = str.length();

		for(i=0; i<len; i++)
		{
			b = str.charAt(i);

			for(j='a'; j<='z'; j++)
			{

				if(Character.toLowerCase(b) == j)
				{
					count++;
				}
			}

			if(count > 1)
			{
				System.out.print(Character.toLowerCase(b) + " ");
			}
			count = 0;
		}
	}
 }
