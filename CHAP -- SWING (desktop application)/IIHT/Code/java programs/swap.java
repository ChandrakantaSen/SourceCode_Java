import java.util.*;
class swap
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter two nos: ");
		a=sc.nextInt();
		b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("swapped result is:" +a+""+b);
	}
}
		