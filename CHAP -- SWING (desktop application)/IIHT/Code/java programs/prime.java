import java.util.*;
class prime{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,c=0,i,j,k=0;
		System.out.print("enter a range: ");
		n=sc.nextInt();
		int a[]=new int[n];
		
	
		for(i=0;i<n;i++)
		{
			
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
					c++;
			}
			if(c==2)
			{
				a[k]=i;k++;
			}
			c=0;
		}
		
		for(i=0;i<a.length;i++)
		{
			System.out.print(""+a[i]+"");
		}
}
	
}