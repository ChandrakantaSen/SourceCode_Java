import java.util.*;
class magic
{
	public static void main (String args[])
	{
		int mod,num,sum=0,t,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		num=sc.nextInt();
		sum=num;
		while(sum>9)
		{
			num=sum;
			sum=0;
			while(num!=0)
			{
				mod=num%10;
				sum=sum+mod;
				num=num/10;
			}
		}
		if(sum==1)
		{
			System.out.println("this is a magic number");
		}
		else
		{
			System.out.println("not a magic number");
		}
	
	}
}