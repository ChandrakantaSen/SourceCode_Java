/*
 * Linear Search
 */

import java.util.*;

class Code5
{
	public static void main (String[] args) 
	{
		int i,q,c=0;
		int p[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array elements: ");
		for(i=0;i<p.length;i++)
		{
			p[i] = sc.nextInt();
		}
		
		System.out.println("Enter the searched element:");
		q = sc.nextInt();
		
		for(i=0;i<p.length;i++)
		{
			if(q == p[i])
			{
				c = 1;
				break;
			}
		}
		
		if(c == 1)
		{
			System.out.println("Searching successful");
		}
		else
		{
			System.out.println("Searching unsuccessful");
		}
	}
}