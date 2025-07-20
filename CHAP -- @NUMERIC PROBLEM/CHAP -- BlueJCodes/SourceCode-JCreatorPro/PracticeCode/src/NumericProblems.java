import java.util.*;
import java.lang.*;

class NumericFunctions
{
	Scanner in = new Scanner(System.in);
	public void EvenOdd()
	{
		int num;
		System.out.println("Enter the number: ");
		num = in.nextInt();

		if(num % 2 == 0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
		}
	}
	public void PrimeCheck()
	{
		int num,i;
		int count = 0;
		System.out.println("Enter the number: ");
		num = in.nextInt();

		for(i = 1; i <= num; i++)
		{
			if(num % i == 0)
			{
				count++;
			}
		}
		if(count == 2)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Composite Number");
		}
	}
	public void FibonacciSeries()
	{
		int f0 = 0, f1 = 1, f2;
		int rng;
		System.out.print("Enter the range: ");
		rng = in.nextInt();
		System.out.println();
		System.out.print(f0 + " " + f1);
		for(int i = 2; i <= rng; i++)
		{
			f2 = f0 + f1;
			f0 = f1;
			f1 = f2;

			System.out.print(" " + f2);
		}
	}
	public void PalindromeCheck()
	{
		int num, temp;
		int d, rev = 0;
		System.out.println("Enter the number: ");
		num = in.nextInt();
		temp = num;

		while(temp > 0)
		{
			d = temp % 10;
			rev = (rev * 10) + d;
			temp = temp / 10;
		}

		if(num == rev)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
			System.out.println("Non-Palindrome Number");
		}
	}
	public void ArmsrongCheck()
	{
		int num,temp;
		int count = 0, d, rev = 0;
		System.out.println("Enter the number: ");
		num = in.nextInt();

		temp = num;
		while(temp != 0)
		{
			temp = temp / 10;
			count++;
		}

		temp = num;
		while(temp != 0)
		{
			d = temp % 10;
			rev = rev + (int)Math.pow(d,count);
			temp = temp / 10;
		}

		if(num == rev)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Non-Armstrong Number");
		}
	}

	public void PressAnyKeytoContinue()
	{
		System.out.println();
		System.out.println("Please any key to continue...!");
		try
		{
			System.in.read();
    		System.out.flush();
		}
		catch(Exception e)
		{
			System.out.println("Exception occurred");
		}
	}
}

class NumericProblems
{
	public static void main (String[] args)
	{
		int ch;
		NumericFunctions obj = new NumericFunctions();

		System.out.println("--- Contents ---");
		System.out.println("1. Check EvenOdd Number");
		System.out.println("2. Check Prime Number");
		System.out.println("3. Fibonacci Series");
		System.out.println("4. Palindrome Checking");
		System.out.println("5. Armstrong Number Checking");
		System.out.println("0. Exit");
		System.out.println();

		while(true)
		{
			System.out.print("Enter the choice: ");
			ch = obj.in.nextInt();
			switch(ch)
			{
				case 1: obj.EvenOdd();			break;
				case 2: obj.PrimeCheck();		break;
				case 3: obj.FibonacciSeries();  break;
				case 4: obj.PalindromeCheck();	break;
				case 5: obj.ArmsrongCheck();	break;
				case 0: System.exit(0);
				default: System.out.println("Invalid Input...");
			}
			obj.PressAnyKeytoContinue();
		}
	}
}
