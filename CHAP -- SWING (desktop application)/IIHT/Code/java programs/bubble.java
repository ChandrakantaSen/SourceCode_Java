import java.util.*;
class bubble
{
public static void main (String[] args) 
{
	int n,t,i,j;
	Scanner sc = new Scanner(System.in);
	System.out.print("enter the total number of elements: ");
	n=sc.nextInt();
	int a[]= new int[n];
	System.out.println("enter the numbers: ");
	for(i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	for(i=0;i<n;i++)
	{
		for(j=0;j<n-1;j++)
		{
			if(a[j]>a[j+1])
			{
				t=a[j];
				a[j]=a[j+1];
				a[j+1]=t;
			}
		}
	}
	System.out.printf("sorted array is:");
	for(i=0;i<n;i++)
	{
		System.out.printf(" "+a[i]+"");
	}
}
}