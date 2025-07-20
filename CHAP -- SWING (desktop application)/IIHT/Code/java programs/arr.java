import java.util.*;
class arr
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num, sum = 0;
		int i;
		System.out.print("enter a number:");
		num=sc.nextInt();
		
		int a[]=new int[num];
		
		System.out.println("Enter Array Elements: ");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Sum of array elements are: ");
		for(i=0;i<a.length;i++)
		{
			sum = sum + a[i];
		}
		
		System.out.println("Array Elements are: ");
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i] +" ");		
		}
		System.out.println("Sum is: " + sum);
	}
}