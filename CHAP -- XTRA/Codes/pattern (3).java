import java.io.*;

class pattern
{
public static void main(String args[])
{
	int r=5;
	int i,s;

	for(i=1; i<=r; i++)
	{
		for(s=1; s<=i; s++)
		{
			System.out.print(" * ");
		}
		System.out.println();
	}
}
}