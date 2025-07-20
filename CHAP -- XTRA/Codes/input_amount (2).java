
import java.io.*;
class input_amount
{
	double a;
	double r;
	double d;
	public void accept()
	{
		try
		{

			System.out.print("FIXED DEPOSITE                    CERTIFICATE");
			System.out.print("\n");
			System.out.print("--------------------------------------------------");
			System.out.print("\n");
			System.out.print("PRINCIPLE AMOUNT(Rs) :");
			BufferedReader obja=new BufferedReader(new InputStreamReader(System.in));
			a=Integer.parseInt(obja.readLine());
			System.out.print("\n");
			System.out.print("RATE OF INTEREST(%)  :");
			BufferedReader objr=new BufferedReader(new InputStreamReader(System.in));
			r=Integer.parseInt(objr.readLine());
			System.out.print("\n");
			System.out.print("PERIOD(days)         :");
			BufferedReader objd=new BufferedReader(new InputStreamReader(System.in));
			d=Integer.parseInt(objd.readLine());
		/*	a=10000;
			r=5;
			d=180;*/
		show_values();
		}
		catch(Exception e)
		{
			System.out.println("DATA INPUT ERROR");
		}
}
	public void show_values()
	{
		double c=a+(a*r*d/365)/100;
		System.out.println("----------------------------------------------------");
		System.out.print("TOTAL AMOUNT IS(Rs)  : "+c);
		System.out.println("\n\n");
	}
}
class banktran
{
	public static void main(String args[])
	{
		input_amount obj1=new input_amount();
		obj1.accept();
	}
}