import java .io.*;
class series1
{
public static void main (String args[]) throws IOException
{
int i,n,s=0;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter the no of terms");
n=Integer.parseInt (br.readLine());
for(i=1;i<=n;i++)
{
s=s+i;    
    }
System.out.println (" The sum of the series upto " +n+ " are " +s);
}
    }
    
    