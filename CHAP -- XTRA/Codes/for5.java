import java.io.*;
class for5
{
public static void main(String args[])throws IOException
{
int i,n;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the range");
n=Integer.parseInt(br.readLine());
System.out.println("The no. from 1-n are as follows");
for(i=1;i<=n;i++)
{
System.out.println(i);
    }
}
    }