import java.io.*;
class for_SO3N
{
public static void main(String args[])throws IOException
{
int i,n,s=0;
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the range:");
n=Integer.parseInt(buf.readLine());
for(i=1;i<=n;i++)
{
s=s+(i*i*i);
}
System.out.println(s);
}
}