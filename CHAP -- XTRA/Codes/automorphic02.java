import java .io.*;
class automorphic02
{
public static void main (String args[]) throws IOException
{
int n,m,s,t,c=0;
double k;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter any number");
n=Integer.parseInt (br.readLine());
s=n*n;
for (m=n;m>0;m=m/10);
{
c++;
    }
    k=Math.pow (10,c);
    t=(int) (k);
    if (s%t==n)
    {
        System.out.println ("The number is a Automorphic");
    }
    else
    {
        System.out.println ("The number is not a Automorphic number ");
    }
}
    }