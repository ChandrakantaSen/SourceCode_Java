import java .io.*;
class Armstrong2          
{
public static void main (String args[]) throws IOException
{
int n,m,d,s=0;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter the no to find the factors");
n=Integer.parseInt (br.readLine());
for (m=n;m>0;m=m/10)
{
d=m%10;
s=s+d*d*d;
m=m/10;
    }
    if (s==n)
    {
        System.out.println ("Armstrong number");
    }
    else
    {
        System.out.println (" Not a Armstrong number");
    }
}
    }
    