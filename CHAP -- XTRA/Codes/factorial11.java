import java .io.*;
class factorial11
{
public static void main (String args[]) throws IOException
{
int i,n,fact=1;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter the no to find the factors");
n=Integer.parseInt (br.readLine());
i=1;
while (i<=n)
{
fact=fact*i;
i++;
    }
    System.out.println ("The factorial of " +n+ " is "+fact);
}
    }