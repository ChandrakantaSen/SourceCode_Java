//s=x/5+x/8+x/11+x/14+...x/n
import java.io.*;
class ser1
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		double y,s=0;
		System.out.println("\n enter the value of n ");
		int n=Integer.parseInt(br.readLine());
		System.out.println("\n enter the value of x ");
		double x=Double.parseDouble(br.readLine());
		for(int i=5;i<=n;i+=3)
		{
			y=x/i;
			s=s+y;

		}
		System.out.print("sum is"+s);
	}

}


