import java.util.*;
class arr3
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int i,num,c;
		System.out.print("enter a number");
		num=sc.nextInt();
		
		int arr[] = new int[num];
		int e[] = new int[num/2];
		
		System.out.println("Enter the values: ");
		for(i=0;i<arr.length;i++)
		{
			arr[i]= i ;
		}
		
		System.out.println("The values: ");
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		c = 0;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				//c++;
		 		e[c]=arr[i];	
		 		c++;
			}
		}
		System.out.println("Even elements are: ");
		for(i=0;i<e.length;i++)
		{
			System.out.print(e[i] + " ");				
		}	
	}
}