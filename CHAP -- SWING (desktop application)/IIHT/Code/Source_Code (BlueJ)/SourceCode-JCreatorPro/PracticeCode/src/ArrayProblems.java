import java.util.*;
import java.lang.*;

class ArrayFunctions
{
	Scanner in = new Scanner(System.in);
	public void ArrayTraversal()
	{
		int size,i;
		System.out.print("Enter the size: ");
		size = in.nextInt();

		int arr[] = new int[size];

		for(i = 0; i < size; i++)
		{
			arr[i] = in.nextInt();
		}

		System.out.println("--- Array Elements are ---");
		for(i = 0; i < size; i++)
		{
			System.out.println(arr[i] + " ");
		}
	}
	public void SumArrayElements()
	{
		int size,i;
		double sum = 0;

		System.out.print("Enter the size: ");
		size = in.nextInt();
		int arr[] = new int[size];

		System.out.println("--- Array Elements are ---");
		for(i = 0; i < size; i++)
		{
			arr[i] = in.nextInt();
		}

		for(i = 0; i < size; i++)
		{
			sum = sum + arr[i];
		}

		System.out.print("Sum of Array Elements are: " + sum);
	}
	public void MaxMinArrayElement()
	{
		int size,i;
		int MAX, MIN, MAXloc = 0, MINloc = 0;

		System.out.print("Enter the size: ");
		size = in.nextInt();
		int arr[] = new int[size];

		System.out.println("--- Array Elements are ---");
		for(i = 0; i < size; i++)
		{
			arr[i] = in.nextInt();
		}

		MAX = arr[0];
		MIN = arr[0];

		for(i = 0; i < size; i++)
		{
			if(arr[i] > MAX)
			{
				MAX = arr[i];
				MAXloc = (i + 1);
			}
			if(arr[i] < MIN)
			{
				MIN = arr[i];
				MINloc = (i + 1);
			}
		}
		System.out.println("Max element of array is: " + MAX + " at position of: " + MAXloc);
		System.out.println("Min element of array is: " + MIN + " at position of: " + MINloc);
	}
	public void InsertElement()
	{
		int size, n, i;
		int position, value;
		System.out.print("Enter the size: ");
		size = in.nextInt();

		int arr[] = new int[size];

		System.out.print("Enter the number of elements: ");
		n = in.nextInt();

		System.out.println("--- Array Elements are ---");
		for(i = 0; i < n; i++)
		{
			arr[i] = in.nextInt();
		}

		System.out.print("Enter the location to be inserted: ");
		position = in.nextInt();

		System.out.println("Enter the element to be inserted: ");
		value = in.nextInt();

		for(i = (n - 1); i >= (position-1); i--)
		{
			arr[i+1] = arr[i];
		}

		arr[position - 1] = value;



		System.out.println("--- Resultant Array is ---");
		for(i = 0; i <= n; i++)
		{
			System.out.println(arr[i]);
		}
	}
	public void ReplaceEvenOdd()
	{
		int size,i,n;
		System.out.print("Enter the size: ");
		size = in.nextInt();

		int arr[] = new int[size];

		System.out.print("Enter the number of elements: ");
		n = in.nextInt();

		System.out.println("--- Array Elements are ---");
		for(i = 0; i < n; i++)
		{
			arr[i] = in.nextInt();
		}

		for(i = 0; i < n; i++)
		{
			if(arr[i] % 2 == 0)
			{
				arr[i] = 0;
			}
			else
			{
				arr[i] = 1;
			}
		}

		System.out.println("--- Resultant Array is ---");
		for(i = 0; i < n; i++)
		{
			System.out.println(arr[i]);
		}

	}
	public void MergeArrays()
	{
		int size,i,n;
		System.out.print("Enter the size: ");
		size = in.nextInt();

		int arr1[] = new int[size];
		int arr2[] = new int[size];
		int arr[]  = new int[size*2];

		System.out.print("Enter the number of elements: ");
		n = in.nextInt();

		System.out.println("--- Array of First Elements are ---");
		for(i = 0; i < n; i++)
		{
			arr1[i] = in.nextInt();
		}

		System.out.println("--- Array of Second Elements are ---");
		for(i = 0; i < n; i++)
		{
			arr2[i] = in.nextInt();
		}

		for(i = 0; i < n; i++)
		{

		}


		System.out.println("--- Resultant Array is ---");
		for(i = 0; i < n; i++)
		{

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

class ArrayProblems
{
	public static void main (String[] args)
	{
		int ch;
		ArrayFunctions obj = new ArrayFunctions();

		System.out.println("--- Contents ---");
		System.out.println("1. Array Traversal");
		System.out.println("2. Sum of Array Elements");
		System.out.println("3. MAX-MIN element of Array");
		System.out.println("4. Insert element at specific position");
		System.out.println("5. Replace Even by 0 and Odd by 1");
		System.out.println("0. Exit");
		System.out.println();

		while(true)
		{
			System.out.print("Enter the choice: ");
			ch = obj.in.nextInt();
			switch(ch)
			{
				case 1: obj.ArrayTraversal();			break;
				case 2: obj.SumArrayElements();			break;
				case 3: obj.MaxMinArrayElement();		break;
				case 4: obj.InsertElement();			break;
				case 5: obj.ReplaceEvenOdd();			break;
				case 0: System.exit(0);
				default: System.out.println("Invalid Input...");
			}
			obj.PressAnyKeytoContinue();
		}
	}
}