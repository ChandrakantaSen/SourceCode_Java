/*
 * Binary Search
 */

import java.util.*;

class Code6
{
	public static void main (String[] args) 
	{
		int i,min,max,mid;
		int q,c = 0;
		int p[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		min = 0;
		max = p.length - 1;
		
		System.out.println("Enter the array elements: ");
		for(i=0;i<p.length;i++)
		{
			p[i] = sc.nextInt();
		}
		
		System.out.println("Enter the searched element:");
		q = sc.nextInt();
		
		while(min<=max)
		{
			mid = (min + max)/2;
			
			if(q > p[mid])
			{
				min = mid + 1;
			}
			else if(q < p[mid])
			{
				max = mid - 1;
			}
			else
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