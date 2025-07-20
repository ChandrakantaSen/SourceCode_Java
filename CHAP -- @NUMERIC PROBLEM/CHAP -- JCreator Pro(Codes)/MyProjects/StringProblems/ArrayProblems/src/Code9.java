/*
 * WAP to find out the even & odd numbers in an array
 */
 
import java.util.*;

class Code9
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
		
		System.out.println("Even elements");
		for(i=0;i<p.length;i++)
		{
			if(p[i] % 2 == 0)
			{
				System.out.print(" " + p[i]);
			}
		}
		
		System.out.println("\nOdd elements");
		for(i=0;i<p.length;i++)
		{
			if(p[i] % 2 != 0)
			{
				System.out.print(" " + p[i]);
			}
		}
	}
}