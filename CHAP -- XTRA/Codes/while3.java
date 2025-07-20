import java.io.*;
class while3
{
public static void main(String args[])throws IOException
{
int i,n;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the range");
n=Integer.parseInt(br.readLine());
System.out.println("The no. from n-1 are as follows");
i=n;
while(i>=1)
{
System.out.print(" "+i);
i--;
    }
}
    }