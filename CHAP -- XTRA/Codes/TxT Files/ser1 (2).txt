//s=x/5+x/8+x/11+x/14+...x/n
import java.io.*;
class ser1
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		double y,s=0;
		System.out.println("\n enter the value of n ");
		String z=br.readLine();
		int n=Integer.parseInt(z);
		System.out.println("\n enter the value of x ");
		String r=br.readLine();
		double x=Double.parseDouble(r);
		for(int i=5;i<=n;i+=3)
		{
			y=x/i;
			s=s+y;

		}
		System.out.print("sum is"+s);
	}

}


