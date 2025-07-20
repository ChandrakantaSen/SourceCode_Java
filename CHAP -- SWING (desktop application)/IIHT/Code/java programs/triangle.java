import java.util.*;
class triangle
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter the 3 sides of the triangle: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if((a==b) && (b==c) && (c==a))
		{
			System.out.println("the triangle is an equilateral triangle");
		}
		else if((a==b) || (b==c) || (c==a))
		{
			System.out.println("the triangle is an isoseceles triangle");
		}
		else if((a!=b) && (b!=c) && (c!=a))
		{
			System.out.println("the triangle is a scalene triangle");
		}
	}
}