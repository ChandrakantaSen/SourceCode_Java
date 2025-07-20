//s=x/5+x/8+x/11+x/14+...x/n
import java.io.*;
class sr11
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		double y,s=0;
		System.out.println("\n enter the value of n ");
		String z=br.readLine();
		int n=Integer.parseInt(z);
		System.out.println("\n enter the value of x ");
		String r=br.readLine();
		double x=Double.parseDouble(r);
		for(int i=5;i<=n;i+=3)
		{
			y=x/i;
			s=s+y;

		}
		System.out.print("sum is"+s);
	}

}


	//s=1/4+1/8+1/12+...........n terms....
import java.io.*;
class sr9
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int c=1;
		double y,s=0;
		System.out.println("\n enter the terms ");
		String x=br.readLine();
		int n=Integer.parseInt(x);
		for(int i=4;i<=n;i=i+4)
		{
			y=1.0/i;
			s=s+y;
			c++;
		}
		System.out.println(s);
	}

}
    

	//s=(1+2)+(1+2+3)+(1+2+3+4)+(1+2+3+........+n)
import java.io.*;
class sr10
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\n enter the limit ");
		String h=br.readLine();
		int n=Integer.parseInt(h);
		int s=1,sum=0;
		for(int i=2;i<=n;i++)
		{
			s+=i;
			sum+=s;   
		}
		System.out.print("sum is "+sum);
	}

}

	//s=x/1!+x2/2!+x3/3!+xn/n!
import java.io.*;
class sr12
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		double s=0,y;
		System.out.println("\n enter the value of n ");
		String z=br.readLine();
		int n=Integer.parseInt(z);
		System.out.println("\n enter the value of x ");
		String r=br.readLine();
		double x=Double.parseDouble(r);
		for(int a=1;a<=n;a++)
		{
			int p=1;
			for(int j=1;j<=a;j++)
			{
				p=p*j;
			}
    
			y=Math.pow(x,a)/p;
			s=s+y;
		}
		System.out.println(s);
	}

}

//s=x1/1!-x2/2!+x3/3!-x4/4!+x5/5-+x6/6!.......xn/n!
import java.io.*;
clss s14
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double s=0,y;
System.out.println("\n enter the of n ");
String z=br.readLine();
int n=Integer.parseInt(z);
System.out.println("\n enter the of x ");
String r=br.readLine();
int x=Integer.parseInt(r);
for(int a=1;a<=n;a++)
{
int p=1;
for(int j=1;j<=a;j++)
{
p=p*j;   
}
y=Math.pow(x,a)/p;
if(a%2==0)
s=s-y;
else
s=s+y;
}
System.out.println(s);
}
}
    