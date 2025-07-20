import java.io.*;
class krish_func
{
static int i,n,m,d,s=0,fact; 
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
public static void input()throws IOException
{
System.out.println("Enter the  number : - ");
n=Integer.parseInt(br.readLine());
    } 
public static void display()
{
System.out.println("The  number is "+n);
    }

public static void krishshow()
{
m=n;
while(m>0)
{
d=m%10;
fact=1;
for(i=1;i<=d;i++)
fact=fact*i;
s=s+fact;
m=m/10;
    }
}
public static void krishcheck()
{
if(s==n)
{
System.out.println(n+" is a krishnamurthy number ");
    }
 else
 {
     System.out.println(n+" is not a krishnamurthy number ");
        }
    }
    public static void main()throws IOException
    {
        krish_func ob=new krish_func();
        ob.input();
        ob.display();
        ob.krishshow();
        ob.krishcheck();
    }
}
    