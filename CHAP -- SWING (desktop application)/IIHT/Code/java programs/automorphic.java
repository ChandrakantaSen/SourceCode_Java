import java.util.*;
class automorphic
{
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,m,mod,c=0;
		System.out.print("enter a number:");
		num=sc.nextInt();
		/*calculate number of digits*/
		int temp=num;
			m=num*num;
		while(temp!=0)
		{
			temp=temp/10;
			c++;	
		}
		if(c==1)
			{
			
				mod=m%10;
				if(mod==num)
				{
					System.out.println("the number is automorphic");
				}
				else
				{
						System.out.println("the number is not automorphic");
				}
			}
			else if(c==2)
			{
				for(i=0;i<2;i++)
				{
					
				}
			}
				
}
}