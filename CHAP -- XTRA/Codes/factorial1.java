import java .io.*;
class factorial1
{
public static void main (String args[]) throws IOException
{
int i,n;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter the no to find the factors");
n=Integer.parseInt (br.readLine());
System.out.println (" The factors of " +n+ " are as follows ");
for (i=1;i<=n;i++)
{
if (n%i==0)
{
System.out.println (i);
    }
}
    }
}