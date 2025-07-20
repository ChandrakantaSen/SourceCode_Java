import java.io.*;
class arm_con1
{
static int n,m,s,d; 
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
arm_con1(int x)//PARAMETERIZED CONSTRUCTOR
{
n=x;
s=0;
    }
public static void display()
{
System.out.println("The  number is "+n);
    }
public static void armno()
{

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
System.out.println(n+" IS AN ARMSTRONG NUMBER ");
    }
    else
    {
        System.out.println(n+" IS NOT AN ARMSTRONG NUMBER ");
    }
}
public static void main()throws IOException
{
int p;
System.out.println("Enter the number : -   ");
p=Integer.parseInt(br.readLine()); 
arm_con1 ob=new arm_con1(p);
ob.display();
ob.armno();
ob.armcheck();
    }
}