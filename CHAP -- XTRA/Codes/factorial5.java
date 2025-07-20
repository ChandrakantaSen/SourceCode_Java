import java .io.*;
class factorial5
{
public static void main (String args[]) throws IOException
{
int i,n,s=0;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter the no to find the factors");
n=Integer.parseInt (br.readLine());
i=1;
while (i<=n)
{
if (n%i==0)
{
s=s+i;
}
i++;
    }
    System.out.println (" The sum of the factors are "+s);
}
    }