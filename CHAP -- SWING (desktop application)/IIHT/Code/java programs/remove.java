import java.util.*;
class remove
{
	public static void main (String args[])
	{
		int mod,num,sum=0,t,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number containing zero:");
		num=sc.nextInt();
		t=num;
		while(t!=0)
		{
			mod=t%10;
			if(mod!=0)
			{
				sum=sum+(int)Math.pow(10,c)*mod;
				c++;
			}
			t=t/10;
		}
		System.out.println("result is: " +sum);
	}
}