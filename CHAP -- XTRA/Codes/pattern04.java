import java.io.*;
class pattern04
{
public static void main (String args []) throws IOException
{
int i,j,n,k=1;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out .println ("Enter the range of the number ");
n=Integer.parseInt (br.readLine ());
for ( i=1;i<=n;i++)
{
for ( j=1;j<=i;j++)
{
System.out.print (""+k);
k++;
    }
    System.out.println ();
}
    }
}