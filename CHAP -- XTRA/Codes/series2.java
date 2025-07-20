import java.io.*;
class series2
{
public static void main(String args[])throws IOException
{
int i,n,s=0;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the range");
n=Integer.parseInt(br.readLine());
i=1;
do
{
s=s+i;
i++;
    }
    while(i<=n);
System.out.println("The sum of the series upto"+n+"is"+s);
    }
}
   