/*W.A.P to calculate the fare which is releated to the distance

First 2 K.m fare=Rs 2.50 .After that 1K.m or their part of

added with this one.*/

class calculation
{
	double dist;
	public double cal(double x)
	{
		dist=x;
		double price;
		int i=2;
        int count=0;
		if(dist<=2)
		{
			price=2.50;
		}
		else
		{
			while(i<=dist)
			{
				i=i+1;
                count=count+1;
			}
			if(dist%1==0)
			count=count-1;
			price=(float)2.50+(float)count;
		}
		return(price);
	}
}


class BusFare
{
	public static void main(String args[])
	{
	   calculation calculation1=new calculation();
	   double d=4;
	   double r1=calculation1.cal(d);
       System.out.println("The fare is Rs.  "  + r1  +  " For Distance of "  + d + "K.M.");
	}
}

