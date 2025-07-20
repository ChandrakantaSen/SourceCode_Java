/*
 * Basics of Array
 */
 
import java.util.*;

class Code1
{
	public static void main (String[] args)
	{
		int i;
		int p[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array elements: ");
		for(i=0;i<p.length;i++)
		{
			p[i] = sc.nextInt();
		}
		
		System.out.println("Array Elements are -");
		for(i=0;i<p.length;i++)
		{
			System.out.println(p[i]);
		}
	}
}