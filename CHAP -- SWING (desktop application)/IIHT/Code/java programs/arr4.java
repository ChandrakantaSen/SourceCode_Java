import java.util.*;
class arr4
{
	public static void main (String[] args)
		 {
		 	Scanner sc = new Scanner(System.in);
		 	int i,j,n1,n2,n3=100;
		 	System.out.print("enter the number of elements in a1 array: ");
		 	n1=sc.nextInt();
		 	int a1[]=new int[n1];
		 	
		 	//enter numbers in first array
		 	System.out.print("enter elements in a1 array: ");
		 	for(i=0;i<a1.length;i++)
		 	{
		 		a1[i]=sc.nextInt();
		 	}
		 	System.out.print("enter the number of elements in a2array: ");
		 	n2=sc.nextInt();
		 	int a2[]=new int[n2];
		 	System.out.print("enter elements in a2 array: ");
		 	
		 	//enter numbers in second array
		 	for(i=0;i<a2.length;i++)
		 	{
		 		a2[i]=sc.nextInt();
		 	}
		 n3=n1+n2;
		 	int a3[]=new int[n3];
		 	
		 	for(i=0;i<n3;i++)
		 	{
		 		if(i<n1)
		 		{
		 			a3[i]=a1[i];
		 		}
		 		else
		 		{
		 			j=0;
		 			while(j<n2)
		 			{
		 			a3[i]=a2[j];
		 			j++;
		 			i++;
		 			}
		 		}
		 	}
		 	for(i=0;i<a3.length;i++)
		 	{
		 			System.out.println(a3[i]);
            }
		 	
}
		 
}
