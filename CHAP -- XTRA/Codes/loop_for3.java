import java .io.*;
class loop_for3
{
public static void main (String args[]) throws IOException
{
int i,n;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter the no. of terms");
n=Integer.parseInt (br.readLine());
for(i=1;i<=n;i++)
{
System.out.println (i);
    }
}
    }