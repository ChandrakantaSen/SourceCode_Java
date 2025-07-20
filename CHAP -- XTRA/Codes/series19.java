import java.io.*;
class series19
{
public static void main (String args[]) throws IOException
{
int i=1,n,se=0,so=0;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter the no of terms");
n=Integer.parseInt (br.readLine());
do
{
 if (i%2==0)
{
se=se+i;
    }
    else
    {
        so=so+i;
    }
    i++;
}
while (i<=n);
 System.out.println ("The sum of the even no is " +n+ " are " +se);
    System.out.println ("The sum of the odd no is " +n+ " are " +so);
}
    }