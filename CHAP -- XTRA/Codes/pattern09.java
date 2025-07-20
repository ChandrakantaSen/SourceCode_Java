import java .io.*;
class pattern09
{
public static void main (String args[]) throws IOException
{
int i,n,j;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter the range");
n=Integer.parseInt (br.readLine());
for (i=1;i<=n;i++)
{
for (j=i;j>=1;j--)
{
System.out.print (" "+j);
    }
System.out.println ();
     }
    }
}