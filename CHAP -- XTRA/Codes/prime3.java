import java .io.*;
class prime3
{
public static void main (String args[]) throws IOException
{
int i=1,n,c=0;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter the no");
n=Integer.parseInt (br.readLine());
do
{
if (n%i==0)
{
c++;
    }
    i++;
}
while (i<=n);
if (c==2)
{
System.out.println (n+ " is a Prime number ");
    }
    else
    {
      System.out.println (n+ " is not a Prime number ");
    }
}
    }