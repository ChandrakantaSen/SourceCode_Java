import java.io.*;

class sumOfFactorial
{
	public static void main(String[] args)throws IOException
	{
		int n,i,j,sum=0,f=1;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println ("Enter the ramge: ");
		n = Integer.parseInt (in.readLine());
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				f=f*j;
			}
			sum = sum + f;
			f=1;
		}		
		System.out.println ("Sum of Factorial is: "+sum	);	
		
	}
}