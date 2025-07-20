import java.util.*;
class water
{
	public static void main (String args[]) 
		{
			Scanner sc=new Scanner(System.in);
			int water_consumed;
			float tax_rate;
			System.out.println("enter the water consumed(in gallons):");
			water_consumed=sc.nextInt();
			if(water_consumed<45)
			{
				System.out.println("no tax");
			}
			if((water_consumed>45)&&(water_consumed<=75))
			{
				System.out.println("tax=475.00");
			}
			if((water_consumed>75)&&(water_consumed<=125))
			{
				System.out.println("tax=750.00");
			}
			if((water_consumed>125)&&(water_consumed<=200))
			{
				System.out.println("tax=1225.00");
			}
			if((water_consumed>200)&&(water_consumed<=350))
			{
				System.out.println("tax=1650.00");
			}
			if(water_consumed>350)
			{
				System.out.println("tax=2000.00");
			}
		}
		
}
