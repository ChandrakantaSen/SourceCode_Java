import java .io.*;
class factorial15
{
public static void main (String args[]) throws IOException
{
int n,m,d;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter the no to find the factors");
n=Integer.parseInt (br.readLine());
System.out.println (" The extracted digit from the number " +n+ " are as follows ");
m=n;
do
{
d=m%10;
System.out.println (d);
m=m/10;
    }
    while (m>0);
}
    }