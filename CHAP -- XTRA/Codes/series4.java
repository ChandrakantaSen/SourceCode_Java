import java.io.*;
class series4
{
public static void main(String args[])throws IOException
{
int i,n,s=0;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the range");
n=Integer.parseInt(br.readLine());
for(i=1;i<=n;i++)
{
s=s+(i*i);
    }
System.out.println("The sum of the square of the series upto"+n+"is"+s);
    }
}
   