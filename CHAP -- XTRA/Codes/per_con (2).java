import java.io.*;
class per_con
{
static int n,i,s;
static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
per_con()//DEFAULT CONSTRUCTOR
{
n=0;
s=0;
    }
public static void input()throws IOException
{
System.out.println("Enter the number :- ");
n=Integer.parseInt(br.readLine());
    }
public static void perfect()
{    
for(i=1;i<n;i++)
{
if(n%i==0)
{
s=s+i;
    }
}
}
public static void check()
{
if(s==n)
{
System.out.println(n+" is a Perfect Number ");
    }
    else
    {
System.out.println(n+" is not a Perfect Number ");
    }
}
public static void main()throws IOException
{
per_con ob=new per_con();
ob.input();
ob.perfect();
ob.check();
    }
}

