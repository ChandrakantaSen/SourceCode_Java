//s=(1+2)+(1+2+3)+(1+2+3+4)+(1+2+3+........+n)
import java.io.*;
class ser2
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\n enter the limit ");
		String h=br.readLine();
		int n=Integer.parseInt(h);
		int s=1,sum=0;
		for(int i=2;i<=n;i++)
		{
			s+=i;
			sum+=s;   
		}
		System.out.print("sum is "+sum);
	}

}

