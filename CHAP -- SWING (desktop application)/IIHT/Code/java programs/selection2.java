import java.util.*;
class selection2
{
	public static void main (String[] args) {
		int n,t,i,j,min=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the total number of elements: ");
		n=sc.nextInt();
		int a[]= new int[n+4];
		System.out.println("enter the numbers: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(i=0;i<n-1;i++)
		{
			min=i;
			for(j=i+1;j<n;j++)
			{
				if(a[min]>a[j])
				{
					min=j;
				}
			//	j++;
			}
			t=a[i];
			a[i]=a[min];
			a[min]=t;
		}
		for(i=0;i<n;i++)
		{
			System.out.print("\n"+a[i]);
		}
	}
}