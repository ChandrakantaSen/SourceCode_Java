import java.util.*;
class greatest
{
	public static void main (String args[]) 
		{
			Scanner sc=new Scanner(System.in);
			int a,b,c,min;
			System.out.println("Enter the numbers:");
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
			
			if((a<b)&&(a<c))
			{
				min=a;
				System.out.println("min=" +a);
			}
			else if((b<a)&&(b<c))
			{
				min=b;
				System.out.println("min=" +b);
			}
			else
			{
				min=c;
				System.out.println("min=" +c);
			}
		}
}