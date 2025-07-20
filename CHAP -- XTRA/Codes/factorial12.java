import java .io.*;
class factorial12
{
public static void main (String args[]) throws IOException
{
int i=1,n,fact=1;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter the no to find the factors");
n=Integer.parseInt (br.readLine());
do
{
fact=fact*i;
i++;
    }
    while (i<=n);
    System.out.println (" The factorial of " +n+ " is " +fact);
}
    }