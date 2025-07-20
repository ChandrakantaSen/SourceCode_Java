import java.util.*;
class merge
{
	public static void main (String[] args) {
		int n,t,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the total number of elements: ");
		n=sc.nextInt();
		int a[]= new int[n];
		System.out.println("enter the numbers: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int l=0,mid,u;
		u=n;
		if(n%2!=0)
		{
			mid=(n/2)+1;
		}
		else
		{
			mid=n/2;
		}
		int k=0;
		int a1[] = new int[l+mid];
		int a2[] = new int[u-mid];
//	System.out.println(+a1.length);
//	System.out.println(+a2.length);
	
		//copy array elements in subarrays
		for(i=0;i<mid;i++)
		{
			a1[i]=a[i];
		}	
		for(i=mid;i<n;i++)
		{
			a2[k]=a[i];
			k++;
		}
	/*	for(i=0;i<mid;i++)
		{
			System.out.println(" "+a1[i]);
		}
		for(i=0;i<a2.length;i++)
		{
			System.out.println(" "+a2[i]);
		} */
		
		for(k=0;k<a.length;)
		{
			for(i=0;i<a1.length;)
			{
				for(j=0;j<a2.length;)
				{
					if(a1[i]<a2[j])
					{
						a[k]=a1[i];
						i++;
						k++;
					}
					else
					{
						a[k]=a2[j];
						j++;
						k++;
					
					}
				}
			}
		}
		for(i=0;i<a.length;i++)
		{
			System.out.print("\n"+a[i]);
		}
			
	}
}
		