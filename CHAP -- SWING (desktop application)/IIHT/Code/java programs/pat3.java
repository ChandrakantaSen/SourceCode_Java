import java.util.*;
class pattern
{
	public static void main (String args[]) 
		{
			int i,j;
			for(i=1;i<=5;i++)
			{
			for(j=1;j<=5;j++)
			{
				if(i%2==0)
				{
					System.out.print(+0+"");
				}
				else
				{
					System.out.print(+1+"");
				}
			}
			System.out.println("\n");
			}
		}
}