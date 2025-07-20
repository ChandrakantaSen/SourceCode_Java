/**
 * WAP to enter a sentence from the keyboard and 
 * count the number of times, a particular word
 * occurs in it. Display the frequency of the search word.  
 */
 
import java.util.*;

class Code10
{
	public static void main (String[] args) 
	{
		String str = "", word = "", st = "";
		char ch;
		int i, len, c = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		str = sc.nextLine();
		
		System.out.println("Enter the word: ");
		word = sc.nextLine();
		
		str = str + " ";
		len = str.length();
		
		for(i = 0; i<(len-1); i++)
		{
			ch = str.charAt(i);
			
			if(ch != ' ')
			{
				st = st + ch;
			}
			else
			{
				if(st.compareTo(word) == 0)
				{
					c++;
				}
				else
				{
					st = "";
				}
			}
		}
		System.out.println("Search word occurs: " + c);
	}
}