import java .io.*;
class Amicable02
{
public static void main (String args[]) throws IOException
{
int i=1,n,m,s=0,s1=0;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter any no");
n=Integer.parseInt (br.readLine());
System.out.println (" Enter any no");
m=Integer.parseInt (br.readLine());
i=1;
while (i<n)
{
if (n%i==0)
{
s=s+i;
    }
    i++;
}
i=1;
while (i<m)
{
if (m%i==0)
{
s1=s1+i;
    }
    i++;
}
if ((s==m)&&(s1==n))
{
System.out.println ("Amicable Number");
    }
else
{
System.out.println ("Not a Amicable Number");
    }
}
    }   