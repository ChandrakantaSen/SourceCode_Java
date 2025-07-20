/**
 * WAP to find the frequency of vowels in a string...
 */
import java.util.*;

class Code13
{
	public static void main (String[] args) 
	{
		String str = "";
		char ch = ' ';
		int i, len, c = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		str = sc.nextLine();
		
		str = str + " ";
		len = str.length();
		
		for(i = 0; i < len; i++)
		{
			ch = str.charAt(i);
			if(ch != ' ')
			{
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				{
					c = (i+1);
					System.out.println("Required vowel & it's position is: " + ch + " = " + c);
				}
			}	
		}
	}
}