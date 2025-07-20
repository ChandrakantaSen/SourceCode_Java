import java.io.*;
class Array2
{
	public static void main(String args[])throws IOException
	{
		int i,j;
		InputStreamReader x=new InputStreamReader(System.in);
		BufferedReader y=new BufferedReader(x);
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		System.out.println("ENTER NOS IN AN ARRAY");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=Integer.parseInt(y.readLine());
			}
		}
			System.out.println("CONTENTS OF ARRAY ARE");
	for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println(" ");
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				b[i][j]=a[j][i];
			}
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
}