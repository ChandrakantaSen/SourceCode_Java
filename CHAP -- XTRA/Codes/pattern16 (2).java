import java.io. *;
class pattern16
{
public static void main (String args[]) throws IOException
{
int i,j,n;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter any no.");
n=Integer.parseInt (br.readLine());
for (i=n;i>=1;i--)
{
for (j=1;j<=i;j++)
{
System.out.print (" "+j);
}
System.out.println ();
    }
}
    }