import java.io.*;
import java.util.*;

class prog
{
	public static void main (String[] args)throws IOException
	{
			try
			{
				int num;
				Scanner sc=new Scanner(System.in);
				System.out.print("enter a number: ");
				num=sc.nextInt();
				if(num<0)
				{
					throw new Exception();
				}
			}
			catch(Exception e)
			{
				System.out.print("ERROR:the number is a negative number");
			}
			finally
			{
				System.out.println("hello");
			}
	}
}