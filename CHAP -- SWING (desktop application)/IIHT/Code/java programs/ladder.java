import java.util.*;
class ladder
{
	public static void main (String args[]) 
		{
			Scanner sc=new Scanner(System.in);
			int cost;
			float after_dis;
			System.out.println("Enter the cost:");
			cost=sc.nextInt();
			if(cost<2000)
			{
				after_dis=(cost*5)/100;
				System.out.println("total cost is: " +after_dis);
			}
			if((cost>=2001)&&(cost<=5000))
			{
				after_dis=(cost*25)/100;
				System.out.println("total cost is: " +after_dis);
			}
			if((cost>=5001)&&(cost<=10000))
			{
				after_dis=(cost*35)/100;
				System.out.println("total cost is: " +after_dis);
			}	
			if(cost>10000)
			{
				after_dis=(cost*50)/100;
				System.out.println("total cost is: " +after_dis);
			}
		}
}
				
			
			