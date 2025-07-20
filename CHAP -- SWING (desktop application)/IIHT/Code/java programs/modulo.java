import java.util.*;
class modulo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c,num,a1,b1,sum;
		System.out.println("Enter the no: ");
		num=sc.nextInt();
		a=num/100;
		a1=num%100;
		b=a1/10;
		b1=a1%10;
		sum=a+b+b1;
		
		System.out.println(""+a+""+b+""+b1);
		
		System.out.println("sum of the digit is: "+sum);
	}
}