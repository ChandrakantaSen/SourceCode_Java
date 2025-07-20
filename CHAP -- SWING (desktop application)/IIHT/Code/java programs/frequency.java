import java.util.*;

class frequency
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int mod,temp,num,count=0,i;
		
		System.out.println("enter a number:");
		num=sc.nextInt();
	
		for(i=0;i<=9;i++)
		{
			temp=num;
		
			while(temp != 0)
			{
				mod=temp%10;
				if(mod==i)
				{
					count++;
				}
				temp=temp/10;
			}
			
			if(count!=0)
			{
				System.out.println("frequency of "+i+" is:  
					"+count);
			}
			count=0;
		}
	}
}