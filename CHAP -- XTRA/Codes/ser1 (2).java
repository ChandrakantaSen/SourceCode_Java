//s=x/5+x/8+x/11+x/14+...x/n
import java.io.*;
class ser1
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		double s=0;
		double n,x;
		System.out.println("\n enter the value of n ");
		n=Double.parseDouble(br.readLine());
		System.out.println("\n enter the value of x ");
	    x=Double.parseDouble(br.readLine());
		for(int i=5;i<=n;i+=3)
		{
			s=s+(x/i);
}
		
		System.out.print("sum is"+s);
	}

}


