import java.util.*;
class arr6
{
	public static void main (String[] args)
		 {
		 	Scanner sc=new Scanner(System.in);
		 	int n,i,n1,s=4,p,t,temp2,d,j;
		 	System.out.print("enter the total number of elements : ");
		 	n=sc.nextInt();
		 	int a[]=new int[n+s];
		 	System.out.print("enter numbers: ");
		 	for(i=0;i<(a.length-s);i++)
		 	{
		 		a[i]=sc.nextInt();
		 	}
		 	System.out.print("enter the number to be deleted: ");
		 	 d=sc.nextInt();
		 	for(i=0;i<(a.length-s);i++)
		 	{
		 		if(a[i]==d)
		 		{
		 			t=a[i];
		 		//	System.out.print(a[i]+" number is present in index "+i);
		 		for(j=i+1;j<(a.length-s);j++)
		 		{
		 			a[i]=a[j];
		 			i++;
		 		}
		 	/*	for(j=(a.length-s);j<a[i];j--)
		 		{
		 			t=a[j-1];
		 			a[j-1]=a[j];
		 		}
		 			
		 		}*/
		 	}
		 	}
		 	for(i=0;i<a.length;i++)
		 	{
		 		if(a[i]==0)
		 		{
		 			a[i-1]=0;
		 		}
		 	}
			for(i=0;i<a.length;i++)
		 	{
		 		System.out.print("\n"+a[i]);
		 	}
		 	
		 }
}