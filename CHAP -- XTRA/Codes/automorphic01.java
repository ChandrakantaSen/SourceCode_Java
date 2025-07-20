import java .io.*;
class automorphic01
{
public static void main (String args[]) throws IOException
{
int n,m,s,t,c=0;
double k;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter any number");
n=Integer.parseInt (br.readLine());
s=n*n;
m=n;
while (m>0)
{
c++;
m=m/10;
    }
    k=Math.pow(10,c);
    t=(int)(k) ;
    if (s%t==n)
    {
        System.out.println ("The number is Automorphic number");
    }
    else 
    {
       System.out.println ("The number is not a Automorphic number");
    }
}
    }