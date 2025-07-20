import java.util.*;
class neon
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int no,sq,mod,div,sum=0,temp;
		System.out.println("enter a number:");
		no=sc.nextInt();
		sq=no*no;
		//System.out.println("" +sq);
		temp=no;
		while(sq!=0)
			{
				mod = sq%10;
				sum = mod+sum;
				sq = sq/10;
			}
			System.out.println("" +sum);
			if (sum==temp)	
				System.out.println(""+temp+"is a neon number");
			else 
					System.out.println(""+temp+"is not a neon number");	
							
	}
}