import java.util.*;
class arr7
{
	public static void main (String[] args)
		 {
		 	Scanner sc = new Scanner(System.in);
		 	int n,i,j,c=0,mod,div,m;
		 	System.out.print("enter total numbers: ");
		 	n=sc.nextInt();
		 	int a[]=new int[n];
		 	int b[]=new int[10];
		 	System.out.print("enter numbers: ");
		 	for(i=0;i<a.length;i++)
		 	{
		 		a[i]=sc.nextInt();
		 	}
		 	for(i=0;i<a.length;i++)
		 	{
		 		m=a[i];
		 	//}
		 		while(m!=0)
		 		{
		 			mod=m%10;
		 			for(j=0;j<b.length;j++)
		 			{
		 				if(mod==j)
		 				{
		 					c++;
		 					b[j]=b[j]+c;
		 					c=0;
		 				}
		 			}
		 			m=m/10;		
		 			}
		 		}
		 		for(i=0;i<b.length;i++)
		 		{
		 			if(b[i]!=0)
		 			System.out.println(""+i+" is present: "+b[i]+"times");
		 		}
		 	}
		 }