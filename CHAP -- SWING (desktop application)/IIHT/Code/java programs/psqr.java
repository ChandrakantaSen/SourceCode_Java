import java.util.*;
class psqr
{
	public static void main (String[] args)
		 {
		 	Scanner sc = new Scanner(System.in);
		 	int num,i,j,k;
		 	System.out.print("enter the range: ");
		 	num=sc.nextInt();
		 	int a[]=new int[num];
		 	for(i=0;i<a.length;i++)
		 	{
		 		a[i]=i;
		 	}
		 	for(i=0;i<a.length;i++)
		 	{
		 		System.out.print(""+a[i]+"");
		 	}
		 	for(i=0;i<a.length;i++)
		 	{
		 		for(j=1;j<=i;j++,k=0)
		 		{
		 			k=j*j;
		 			if(k==a[i])
		 				System.out.println("\n"+a[i]+"");
		 		}
		 		
		 	}
		 }
}