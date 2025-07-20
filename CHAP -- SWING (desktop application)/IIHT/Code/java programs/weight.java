import java.util.*;
class weight
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int wt,cost;
		System.out.print("enter the weight:");
		wt=sc.nextInt();
		if(wt<=10)
		{
			cost=wt*20;
			System.out.println("cost is: "+cost);
		}
		else if((wt>10)&&(wt<=30))
		{
			cost=200+(wt-10)*10;
			System.out.println("cost is: "+cost);
		}
		else if((wt>30)&&(wt<=50))
		{
			cost=200+200+(wt-30)*8;
			System.out.println("cost is: "+cost);	
		}
		else if(wt>50)
		{
			cost=200+200+160+(wt-50)*5;
			System.out.println("cost is: "+cost);
		}
		
		}
		
	}
