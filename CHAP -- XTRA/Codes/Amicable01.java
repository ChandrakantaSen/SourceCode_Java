import java .io.*;
class Amicable01
{
public static void main (String args[]) throws IOException
{
int i,n,m,sun=0,sum=0;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter any no");
n=Integer.parseInt (br.readLine());
System.out.println (" Enter any no");
m=Integer.parseInt (br.readLine());
for (i=1;i<n;i++)
{
if (n%i==0)
{
sun=sun+i;
    }
}
for (i=1;i<m;i++)
{
if (m%i==0)
{
sum=sum+i;
    }
}
if ((sun==m)&&(sum==n))
{
System.out.println ("Amicable Number");
    }
else
{
System.out.println ("Not a Amicable Number");
    }
}
    }   