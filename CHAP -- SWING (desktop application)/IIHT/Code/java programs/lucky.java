import java.util.*;
class lucky1
{
	static int i,j,range;
	static int a[] = new int[100];
	static void number()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a range: ");
		range=sc.nextInt();
		//int a[] = new int[range];
		
		System.out.println("Numbers are: ");
		for(i=1;i<=range;i++)
		{
			a[i]=i;
		}
	}
	
	static void remove()
	{
		//number();
		for(i=2;i<=range;i++)
		{
			int k=1;
			for(j=i;j<=range;j=j+i)
			{
				for(k=1;k<=range;k++)
				{
						if(a[k]!=a[j])
					{
						System.out.print(" "+a[k]);
						
					}
				}	
				
			}
			
			System.out.println();
		}
		
	}	

}



class lucky
{
 public static void main (String[] args)
 	 {
 	 	
 	 	lucky1 obj = new lucky1();
 	 	obj.number();
 	 	obj.remove(); 
	 }
}