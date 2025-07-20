import java.util.*;
class nonzero
{
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,p=0,;
		System.out.print("enter a number:");
		num=sc.nextInt();
		temp=num;
		while(temp!=0)
		{
			mod=temp%10;
			if(temp==0)
			{
				mod=mod*10;
				sum=sum+mod;
			}
			temp=temp/10;
		}
		c=0;
		