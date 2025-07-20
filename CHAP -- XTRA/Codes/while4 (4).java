import java.io.*;
class while4
{
public static void main(String args[])throws IOException
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
int n;
System.out.println("Enter the range:");
n=Integer.parseInt(buf.readLine());
int i=10;
while(i>=n)
{
System.out.println(i);
i--;
}
}
}