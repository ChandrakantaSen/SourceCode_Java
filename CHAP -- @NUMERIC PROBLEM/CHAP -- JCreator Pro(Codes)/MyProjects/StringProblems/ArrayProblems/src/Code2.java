/*
 * Basics of Array - Sum of array elements
 */
 
import java.util.*;

class Code2
{
	public static void main (String[] args)
	{
		int i,sum=0;
		int p[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array elements: ");
		for(i=0;i<p.length;i++)
		{
			p[i] = sc.nextInt();
		}
		
		for(i=0;i<p.length;i++)
		{
			sum = sum + p[i];	
		}
		
		/*System.out.println("Array Elements are -");
		for(i=0;i<p.length;i++)
		{
			System.out.println(p[i]);
		}*/
		System.out.println("Sum is: " + sum);
	}
}