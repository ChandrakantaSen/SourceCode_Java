import java .io.*;
class factorial6
{
public static void main (String args[]) throws IOException
{
int i=1,n,s=0;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter the no to find the factors");
n=Integer.parseInt (br.readLine());
do
{
if (n%i==0)
{
s=s+i;
    }
    i++;
}
    while (i<=n);
 System.out.println (" The sum of the factors are "+s);
    }
}