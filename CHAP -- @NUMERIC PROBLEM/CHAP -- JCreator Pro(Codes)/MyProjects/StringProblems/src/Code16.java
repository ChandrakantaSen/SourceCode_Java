/*
 * Check a string is Happy Word or not
 */

import java.util.*;
 
class Happy
{
	String str,word;
	int i,d, value, sum, x;
	Scanner sc = new Scanner(System.in);
	
	void userInput()
	{
		System.out.println("Enter the string: ");
		str = sc.nextLine();		//VAT
	}
	
	void IsCheck()
	{
		word = "";
		for(i=0;i<str.length();i++)
		{
			d = (int)(str.charAt(i) - 'A') + 1;
			word = word + d;
		}
		value = Integer.parseInt(word);
		//System.out.println("Value is: " + value);
		
		while(value > 9)
		{
			sum = 0;
			while(value > 0)
			{
				x = value % 10;
				sum = sum + (int)Math.pow(x,2);
				value = value / 10;
			}
			value = sum;
		}
		
		if(value == 1)
		{
			System.out.println("Happy Word...");
		}
		else
		{
			System.out.println("Not a Happy Word");
		}
	}
} 
 
class Code16
{
	public static void main (String[] args) 
	{
		Happy sObj = new Happy();
		sObj.userInput();
		sObj.IsCheck();
	}
}