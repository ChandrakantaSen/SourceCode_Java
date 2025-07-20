import java .io.*;
class factorial17                         
{
public static void main (String args[]) throws IOException
{
int n,m,d,s=0;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter the no to find the factors");
n=Integer.parseInt (br.readLine());
for (m=n;m>0;m=m/10)
{
d=m%10;
s=s+d;
m=m/10;
    }
    System.out.println (" The sum of the digit of the numbers " +n+ " is " +s );
}
    }