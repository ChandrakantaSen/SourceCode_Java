// Implementation of Pascal Triangles...
import java.io.*;

class fact
{
	int i;
	int ret;

	int fact (int y)//constructor calling
	{   for(i=0;i<=y;i++)
		{
			if(i==0)	ret = 1;
			else
			{
				ret = ret*i;
			}
		}
		return (ret);

	}
}


class pascal
{
	public static void main(String args[])
	{
		DataInputStream in = new DataInputStream(System.in);
		int x;
		int z;
		try
		{
		System.out.print(" Enter The Label :- ");
		x =Integer.parseInt(in.readLine());
		System.out.println("\n    Pascal Triangle ");
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~ ");
			for(int i=0;i<=x-1;i++)
				{
					for(int j=0;j<=i;j++)
					{
							fact sent = new fact();
							z =sent.fact(i) /( sent.fact(i-j) * sent.fact(j) );
							System.out.print("\t"+z);
					}

					System.out.print("\n");
				}
		}
		catch(Exception e)
		{
			System.out.println("Data type Error");
		}


	}
}
