import java.io.*;
class for3
{
public static void main(String args[])throws IOException
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
int n;
System.out.println("Enter the range:");
n=Integer.parseInt(buf.readLine());
int i;
for(i=1;i<n;i++)
{
System.out.println(i);
}
}
}