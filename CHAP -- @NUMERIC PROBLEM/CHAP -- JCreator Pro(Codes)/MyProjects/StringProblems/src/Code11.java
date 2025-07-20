/**
 * WAP to read a word. Print the position
 * of the first vowel occurring in the word.
 * If there is no vowel in the word then print - "Sorry no vowel...!"
 */
 
import java.util.*;

class Code11
{
	public static void main (String[] args)
	{
		String str = "";
		char ch = ' ';
		int len,i,c = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		str = sc.nextLine();
		
		len = str.length();
		
		for(i = 0; i < len; i++)
		{
			ch = str.charAt(i);
			if(ch != ' ')
			{
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				{
					c = (i+1);
					break;
				}
			}
		}
		System.out.println("Required Vowel is: " + ch);
		System.out.println("It's Position is: " + c);
	}
}