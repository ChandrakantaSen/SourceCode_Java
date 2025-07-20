import java .io.*;
class loop1
{
public static void main (String args[]) throws IOException
{
int i,n;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter no of terms");
n=Integer.parseInt (br.readLine());
i=1;
while(i<=n)
{
System.out.println (i);
    i++;
    }
    }
}
