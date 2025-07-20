import java .io.*;
class series14

{
public static void main (String args[]) throws IOException
{
int i,n ,s=0;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter the no of terms");
n=Integer.parseInt (br.readLine());
for(i=1;i<=n;i++)
{
if (i%2==1)
   {
       s=s+i;
    }
}
    System.out.println ("The sum of the odd no is " +n+ " are " +s);
}
    }