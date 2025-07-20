import java.io.*;
class hcflcm
{
static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
static int a,b,hcf,lcm,i;
hcflcm(int x,int y)/*PARAMETERIZED CONSTRUCTOR*/
{
a=x;
b=y;
    }
public static void display()
{
System.out.println("The entered two numbers are "+a+" and "+b);
    }
public static void calculate()
{if(a<=b)
i=a;
else
i=b;
for(;i>=1;i--)
{
if((a%i==0)&&(b%i==0))
{
hcf=i;
break;
    }
}
for(;;i++)
{
if((i%a==0)&&(i%b==0))
{
lcm=i;
break;
    }
}System.out.println("H.C.F is "+hcf);
System.out.println("L.C.M is "+lcm);
    }
public static void main(String args[])throws IOException
{
hcflcm ob=new hcflcm(6,8);
ob.display();
ob.calculate();
    }
}