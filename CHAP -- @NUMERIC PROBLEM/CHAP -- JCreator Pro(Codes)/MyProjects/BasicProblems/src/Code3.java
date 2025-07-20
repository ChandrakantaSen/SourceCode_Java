import java.util.*;

class Code3
{
	public static void main (String[] args) 
	{
		int n;
		double amt=0.00;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of calls: ");	
		n = sc.nextInt();
		
		if(n > 0 && n <= 120)
		{
			amt = 0;
		}
		else if(n > 120 && n <= 220)
		{
			amt = 	0 + (n - 120)*1.00;
		}
		else
		{
			amt = 0 + 100 + (n - 220)*1.25;
		}
		
		double total = 500 + amt;
		
		System.out.println("Total Calls: " + n);
		System.out.println("Total Bill of amount: " + total);
	}
}