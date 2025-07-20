import java.io.*;
class for_SO6N_D
{
public static void main(String args[])throws IOException
{
double i,n,s=0;
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the range:");
n=Integer.parseInt(buf.readLine());
for(i=1;i<=n;i++)
{
s=s+(Math.pow(i,6));
}
System.out.println(s);
}
}