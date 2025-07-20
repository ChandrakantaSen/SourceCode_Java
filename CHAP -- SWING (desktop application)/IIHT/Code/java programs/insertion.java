import java.util.*;
class insertion
{
	public static void main (String[] args) {
		int n,t,i,j,k=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the total number of elements: ");
		n=sc.nextInt();
		int a[]= new int[n];
		System.out.println("enter the numbers: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			k=i;
			for(j=k+1;j<=n-1;j++,k=i)
			{
				if(a[j]<a[k])
				{
					t=a[j];
					a[j]=a[k];
					a[i]=t;
					k++;
				}
				k++;
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.print("\n"+a[i]);
		}
	}
		}
		