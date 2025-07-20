import java.util.*;

class Unique_No
{
	public static void main (String[] args) 
	{
		int n,p,d,i,c=0,flag=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		n = sc.nextInt();
		
		
		for(i=0;i<=9;i++)
		{
			p=n;
			while(p!=0)
			{
				d = p%10;
				if(d==i)	
				{
					c++;	
				}
				p=p/10;
			}	
			if(c>1)
			{
			
				break;
			}
			c=0;
		}
		if(flag==0)
		{
			System.out.println("Unique Number");
		}	
		else
		{
			System.out.println("Not Unique Number");
		}
		
	}
}