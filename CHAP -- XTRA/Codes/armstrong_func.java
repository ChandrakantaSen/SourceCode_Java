import java.io.*;
class armstrong_func
{
static int n,m,s,d; 
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
public static void input()throws IOException
{
System.out.println("Enter the  number : - ");
n=Integer.parseInt(br.readLine());
    } 
public static void display()
{
System.out.println("The number is "+n);
    }

public static void armno()
{
s=0;
m=n;
while(m>0)
{
d=m%10;
s=s+(d*d*d);
m=m/10;
    }
} 
public static void armcheck()
{   
if(s==n)
{
System.out.println(n+" IS AN ARMSTRONG NUMBER "+s);
    }
    else
    {
        System.out.println(n+" IS NOT AN ARMSTRONG NUMBER "+s);
    }
}
public static void main()throws IOException
{
armstrong_func ob=new armstrong_func();
ob.input();
ob.display();
ob.armno();
ob.armcheck();
    }
}