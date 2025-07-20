import java.util.*;
class binary
{
	public static void main (String[] args)
		 {
		 	Scanner sc = new Scanner(System.in);
		 	int i,num,num2;
		 	System.out.print("enter the total number: ");
		 	num=sc.nextInt();
		 	int a[]=new int[num];
		 	System.out.print("enter numbers: ");
		 	for(i=0;i<a.length;i++)
		 	{
		 		a[i]=sc.nextInt();
		 	}
		 	for(i=0;i<a.length;i++)
		 	{
		 		System.out.print(a[i]);
		 	}
		 	int lb=0,ub=num,mid=(lb+ub)/2;
		 	System.out.print("enter a number: ");
		 	num2=sc.nextInt();
		 	if(num2<a[mid])
		 	{
		  		for(i=0;i<mid;i++)
			 	{
				 	if(a[i]==num2)
				 	{
				 		System.out.println("number exist");
				 	}
			 	}
		 	}
		 	else 
		 		for(i=mid;i<num;i++)
		 		{
		 		if(a[i]==num2)
		 		{
		 		System.out.println("number exist");	
		 		}	
		 		} 	
}
}