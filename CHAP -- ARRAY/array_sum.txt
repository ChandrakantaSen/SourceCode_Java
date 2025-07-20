// sum of elements of an array.
import java.io.*;
class array_sum
{
	public static void main(String args[]) throws IOException
	{
		int i,s=0;
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Size of Array : ");
		int n= Integer.parseInt(obj.readLine());
		int a[]= new int[n];
		for (i=0;i<n;i++)
		{
			System.out.print("Enter Value : ");
			a[i]=Integer.parseInt(obj.readLine());
		}
		System.out.print("Output \n\n\n\n\n");
		for(i=0;i<n;i++)
		{
			System.out.print("  "+a[i]);
			s+=a[i];
		}
		System.out.println("="+s);
	}
}
