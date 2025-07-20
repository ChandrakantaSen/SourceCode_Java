import java.io.*;
class per_con1
{
static int n,i,s;
static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
per_con1(int x)// CONSTRUCTOR
{
n=x;
s=0;
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
int p;
System.out.println("Enter the number : -   ");
p=Integer.parseInt(br.readLine()); 
per_con1 ob=new per_con1(p);
ob.perfect();
ob.check();
    }
}

