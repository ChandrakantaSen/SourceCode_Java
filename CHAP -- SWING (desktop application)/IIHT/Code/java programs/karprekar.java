import java.util.*;
class karprekar
{
	public static void main (String args[])
	{
		int m=1,num,mod,div,sum,t1,c1,c2,d,i;
		int sqr,t2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		num=sc.nextInt();
		t1=num;
		c1=0;
		while(t1!=0)
		{
			t1=t1/10;
		    c1++;
		}
		System.out.println("number of digits in the given number:" +c1);
		sqr=(int)Math.pow(num,2);
		System.out.println("square of the given number: "+sqr);
		
		t2=sqr;
		c2=0;
		while(t2!=0)
		{
			t2=t2/10;
		    c2++;
		}
		System.out.println("number of digits in the given number:" +c2);
		for(i=0;i<c1;i++)
		{
			m=m*10;
		}
		mod=sqr%m;
		div=sqr/m;
		sum=mod+div;
		System.out.println("mod: " +mod +"div: " +div +"sum: "+sum);
		if(sum==num)
		{
			System.out.println("the number is karprekar number");
		}
		else
			System.out.println("the number is not a karprekar number");
	}
}
		
		