import java.io.*;
class float_addition
{
	public static void main(String args[]) throws IOException
	{
	BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
	float a,b,c;
	System.out.print("Enter 1st Value  ");
	a=Float.parseFloat(obj.readLine());
	System.out.print("Enter 2nd Value  ");
	b=Float.parseFloat(obj.readLine());
	c=a+b;
	System.out.println("Sum is = " +c);	
	}
}