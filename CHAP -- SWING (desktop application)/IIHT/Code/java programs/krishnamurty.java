import java.util.*;
class krishnamurty
{
	public static void main (String[] args)
		 {
		 	Scanner sc = new Scanner(System.in);
		 	int num,mod,div,sum=0,temp,i;
		 	System.out.print("enter a number: ");
		 	num = sc.nextInt();
		 	temp = num;
		 	while(num!=0)
		 	{
		 		mod=num%10;
		 		int fact=1;
		 		for(i=mod;i>=1;i--)
		 		{
		 			fact=fact*i;
		 		}
		 		sum=sum+fact;
		 		num=num/10;	
		 	}
		 	
		 	if(sum==temp)
		 		System.out.println(""+temp+" is krishnamurty no");
		 	else
		 		System.out.println(""+temp+" is  not krishnamurty no");
}
}