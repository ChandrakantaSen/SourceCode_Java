import java.io.*;
class pattern24
{
public static void main (String args[]) throws IOException
{
int i,j,n;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter any no.");
n=Integer.parseInt (br.readLine());
for (i=n;i>=1;i--)
{
for (j=i;j<=n;j++)
{
System.out.print (" * ");
}
System.out.println ();
    }
}
    }