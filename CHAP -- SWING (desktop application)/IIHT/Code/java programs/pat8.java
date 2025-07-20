import java.util.*;
class pat8
{
	public static void main (String[] args)
		 {
		 	int i,j;
		 	for(i=1;i<=5;i++)
		 	{
		 		for(j=1;j<=5;j++)
		 		{
		 			if((i==1)||(i==5))
		 			{
		 				if((j==1)||(j==5))
		 				{
		 					System.out.print(+0+"");
		 				}
		 				else
		 				{
		 					System.out.print(+1+"");
		 				}
		 			}
		 			else if((j>1)&&(j<5))
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