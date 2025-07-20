import java .io.*;
class Amicable03
{
public static void main (String args[]) throws IOException
{
int i,n,m,s=0,s1=0;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter any no");
n=Integer.parseInt (br.readLine());
System.out.println (" Enter any no");
m=Integer.parseInt (br.readLine());
i=1;
do
{
if(n%i==0)
{
s=s+i;
    }
    i++;
}
    while (i<n);
i=1;
do
{
if(m%i==0)
{
s1=s1+i;
    }
    i++;
}
    while (i<m);
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
        