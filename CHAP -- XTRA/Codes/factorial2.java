import java .io.*;
class factorial2
{
public static void main (String args[]) throws IOException
{
int i,n;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter the no to find the factors");
n=Integer.parseInt (br.readLine());
System.out.println (" The factors of " +n+ " are as follows ");
i=1;
while (i<=n)
{
if (n%i==0)
{
System.out.println (i);
        }
        i++;
    }
}
}