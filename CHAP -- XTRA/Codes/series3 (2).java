import java .io.*;
class series3
{
public static void main (String args[]) throws IOException
{
int i,n,s=0;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter the no of terms");
n=Integer.parseInt (br.readLine());
i=1;
do
{
s=s+i;
i++;
    }
    while (i<=n);
    System.out.println ("The sum of the series upto " +n+ " are " +s);
}
    }