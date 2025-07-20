/*input number triangle */
import java.io.*;
class input
{
	public static void main(String args[]) throws IOException
	{
		int n;
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Height of the Triangle : ");
		n=Integer.parseInt(obj.readLine());
                for(int i = n;i>=1;i--)
		{
                        for(int j=n;j>=i;j--)
			{
                                System.out.print(i);
			}
		System.out.println();
		}
	}
}	
