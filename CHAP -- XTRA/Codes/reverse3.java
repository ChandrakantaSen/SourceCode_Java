import java .io.*;
class reverse3
{
public static void main (String args[]) throws IOException
{
int n,m,d,s=0;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter the no to find the factors");
n=Integer.parseInt (br.readLine());
m=n;
do
{
d=m%10;
s=s*10+d;
m=m/10;
    }
    while (m>0);
     System.out.println (" The reverse no of "  +n+  " is " +s);
}
    }