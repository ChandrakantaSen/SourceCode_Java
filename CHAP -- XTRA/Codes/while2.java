import java.io.*;
class while2
{
public static void main(String args[])throws IOException
{
int i,n;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the range");
n=Integer.parseInt(br.readLine());
System.out.println("The no. from 1-n are as follows");
i=1;
while(i<=n)
{
System.out.println(i);
i++;
    }
}
    }