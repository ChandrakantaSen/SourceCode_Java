/*
 * Array example - Sum of array elements based on even or odd  positions
 */
 
import java.util.*;

class Code8
{
	public static void main (String[] args)
	{
		int i;
		int evenSum = 0, oddSum = 0;
		int p[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array elemets: ");
		for(i=0;i<p.length;i++)
		{
			p[i] = sc.nextInt();
		}
		
		for(i=0;i<p.length;i++)
		{
			if(i%2 == 0)
			{
				evenSum = evenSum + p[i];
			}
			else
			{
				oddSum = oddSum + p[i];
			}
		}
		
		System.out.println("Even Sum is: " + evenSum);
		System.out.println("Odd Sum is: " + oddSum);
		
	}
}