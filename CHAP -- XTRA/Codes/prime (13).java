  /* Program for prime number */
import java.io.*;
class prime
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter the limit : "); 
int n=Integer.parseInt(br.readLine());
for(int i=2;i<=n;i++)
{
 int count=0;
 for(int j=1;j<=i;j++)
  {
   if(i%j==0)
     count=count+1;
  }
if(count==2)
 System.out.println(" prime numbers are:\t"+i);
}
    }
}