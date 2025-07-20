/*input number triangle */
import java.io.*;
class input_number_triangle
{
	public static void main(String args[]) throws IOException
	{
		int n;
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Height of the Triangle : ");
		n=Integer.parseInt(obj.readLine());
		for(int i = 1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
		System.out.println();
		}
	}
}	