import java .io.*;
class factorial4
{
public static void main (String args[]) throws IOException
{
int i,n,s=0;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter the no to find the factors");
n=Integer.parseInt (br.readLine());
for (i=1;i<=n;i++)
{
if (n%i==0);
{
s=s+i;
    }
}
System.out.println (" The sum of the factors of given no are "+s);
    }
}