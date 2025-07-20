import java.io.*;
class do_while3
{
public static void main(String args[])throws IOException
{
int i,n;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the range");
n=Integer.parseInt(br.readLine());
System.out.println("The no. from n-1 are as follows");
i=n;
do
{
System.out.print(" "+i);
i--;
    }
    while(i>=1);
}
    }
  