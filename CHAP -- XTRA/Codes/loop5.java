import java .io.*;
class loop5
{
public static void main (String args[]) throws IOException
{
int i,n;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter the no of terms");
n=Integer.parseInt (br.readLine());
i=1;
do
{
System.out.println (i);
    i++;
    }
while(i<=n);    
}
}
