import java.io.*;
class series5
{
public static void main(String args[])throws IOException
{
int i,n,s=0;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the range");
n=Integer.parseInt(br.readLine());
i=1;
while(i<=n)
{ 
s=s+(i*i);
i++;
    }
System.out.println("The sum of the square of the series upto"+n+"is"+s);
    }
}
   