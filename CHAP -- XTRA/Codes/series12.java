import java.io.*;
class series12
{
public static void main(String args[])throws IOException
{
double i,n,s=0;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the range");
n=Double.parseDouble(br.readLine());
for(i=1;i<=n;i++)
{
s=s+(Math.pow(i,i));
    }
System.out.println("The sum of the  series upto"+n+"is"+s);
    }
}
   