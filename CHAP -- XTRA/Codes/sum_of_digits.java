// sum_of_digits.java
import java.io.*;
class sum_of_digits
{
	public static void main(String args[]) throws IOException
	{
		int n;
		System.out.print("Enter Any Number : ");
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(obj.readLine());
		int d=0;
		while(n>0)
		{
			d+=n%10;
			n/=10;
		}		
		System.out.println("Sum of the Digits ="+d);		
		System.out.println("End of Program");
	}
}