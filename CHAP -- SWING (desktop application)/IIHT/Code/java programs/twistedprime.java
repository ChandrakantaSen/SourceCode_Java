import java.util.*;
class twistedprime
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		int c1=0,i,num,mod,c=0;
		System.out.println("enter the no:");
		num=sc.nextInt();
		for(i=1;i<=num;i++)
		{
			mod=num%i;
			if(mod==0)
			{
				c++;
			}	
		}
		if(c==2)
		{
			System.out.println(""+ num +"is a prime number");
		}
		else
		{
			System.out.println("wrong entry");
		}
	int t;
	t=num;
	while(t!=0)
	{
		t=t/10;
		c1++;
	}
		System.out.println("number of digits in that number is:" +c1);
		int t1=num,sum=0,c3=0,c2=c1-1;
		while(t1!=0)
		{
			mod=t1%10;
			sum=sum+((int)Math.pow(10,c2))*mod;
			c2--;
			t1=t1/10;
		}
			System.out.println("twisted number is: "+sum);
			for(i=1;i<=sum;i++)
		{
			mod=sum%i;
			if(mod==0)
			{
				c3++;
			}	
		}
		if(c3==2)
		{
			System.out.println(""+ sum +"is a twisted prime number");
		}
			
	}
}