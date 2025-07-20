import java.util.*;
class arr5
{
	public static void main (String[] args)
		 {
		 	Scanner sc=new Scanner(System.in);
		 	int n,i,n1,s=4,p,temp,temp2,q;
		 	System.out.print("enter the total number of elements : ");
		 	n=sc.nextInt();
		 	int a[]=new int[n+s];
		 	System.out.print("enter numbers: ");
		 	for(i=0;i<(a.length-s);i++)
		 	{
		 		a[i]=sc.nextInt();
		 	}
		 	System.out.print("enter a number to be inserted: ");
		 	n1=sc.nextInt();
		 	System.out.print("enter a position of that number: ");
		 	p=sc.nextInt();
		 
		 /*	while(a[p+1]!=0)
		 	{
		 		temp2=a[p+1];
		 		a[p+1]=temp;
		 		temp=a[p+3];
		 		a[p+2]=temp2;
		 		p++;
		 	}*/
		 	for(i=(a.length-s);i>=p;i--)
		 	{
		 			a[i+1]=a[i];
		 	}
		 		if(a[p]!=0)
		 	{
		 		temp=a[p];
		 		a[p]=n1;
		 	}
		 	else
		 	{
		 			a[p]=n1;
		 	}
		 		
		 	for(i=0;i<a.length;i++)
		 	{
		 		System.out.print("\n"+a[i]);
		 	}
         }
}