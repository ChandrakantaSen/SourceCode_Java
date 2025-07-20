import java .io.*;
class factorial8
{
public static void main (String args[]) throws IOException
{
int i,n,s=0;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter the no to find the factors");
n=Integer.parseInt (br.readLine());
i=1;
while (i<n)
{
if (n%i==0)
{
s=s+i;
}
i++;
    }
    if (s==n)
{
System.out.println (" The number is a perfect number "+s);
    }
    else 
    {
      System.out.println(" The number is not a perfect number "+s);
    }
}
    }
  