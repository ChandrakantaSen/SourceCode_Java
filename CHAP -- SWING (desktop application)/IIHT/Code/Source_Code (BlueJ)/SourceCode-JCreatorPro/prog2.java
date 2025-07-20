import java.io.*;
import java.util.*;

class prog2
{
	public static void main (String[] args)throws IOException
		{
			int x,y,result;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter two numbers: ");
			x=sc.nextInt();
			y=sc.nextInt();
			
			try
			{
				if(y==0)
				{
					throw new Exception();
				}
				else
				{
					result=x/y;
					System.out.println("the result is: " +result);	
				}
			}
			catch(Exception e)
				{
					System.out.println("ERROR:divide by 0 ");
				}
			
		}
}