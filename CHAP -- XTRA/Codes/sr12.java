//s=x/1!+x2/2!+x3/3!+xn/n!
import java.io.*;
class sr12
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		double s=0,y;
		System.out.println("\n enter the value of n ");
		String z=br.readLine();
		int n=Integer.parseInt(z);
		System.out.println("\n enter the value of x ");
		String r=br.readLine();
		double x=Double.parseDouble(r);
		for(int a=1;a<=n;a++)
		{
			int p=1;
			for(int j=1;j<=a;j++)
			{
				p=p*j;
			}
    
			y=Math.pow(x,a)/p;
			s=s+y;
		}
		System.out.println(s);
	}

}
