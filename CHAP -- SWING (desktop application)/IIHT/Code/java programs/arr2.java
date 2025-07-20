import java.util.*;
class arr2
{
	public static void main (String[] args)
 {
 	Scanner sc=new Scanner(System.in);
 	int num,n,i;
 	System.out.print("enter a range: ");
 	num=sc.nextInt();
 	int arr[]= new int[num];
 	System.out.println("enter numbers: ");
 	for(i=0;i<arr.length;i++)
 	{
 		arr[i]=sc.nextInt();
 	}
 	System.out.println("enter a number: ");
 	n=sc.nextInt();
 	for(i=0;i<arr.length;i++)
 	{
 		if(arr[i]==n)
 		{
 			System.out.println(arr[i]+"number exist in the array index"+i);
 		}
 		else
 		{
 			System.out.println("number does not exist in the array");
 		}
 			
 	}
}
}
	
