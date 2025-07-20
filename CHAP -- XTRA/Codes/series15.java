import java .io.*;
class series15
{
public static void main (String args[]) throws IOException
{
int i,n,s=0;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter the no of terms");
n=Integer.parseInt (br.readLine());
i=1;
while(i<=n)
{
if (i%2==1)
    {
        s=s+i;
    }
    i++;
}
System.out.println ("The sum of the odd no is " +n+ " are " +s);
    }
}