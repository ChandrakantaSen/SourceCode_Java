import java.io.*;
class series14
{
public static void main(String args[])throws IOException
{
double i,n,s=0;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the range");
n=Double.parseDouble(br.readLine());
i=1;
do
{
s=s+(Math.pow(i,i));
i++;
    }
    while(i<=n);
System.out.println("The sum of the cube of the series upto"+n+"is"+s);
    }
}
   