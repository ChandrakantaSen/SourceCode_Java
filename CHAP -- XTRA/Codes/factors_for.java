import java.io.*;
class factors_for
{
public static void main(String args[])throws IOException
{
int i,n,s=0;
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number to find its factors :");
n=Integer.parseInt(buf.readLine());
for(i=1;i<=n;i++)
{
if(n%i==0)
{
System.out.println("The factors are : "+i);
}
}
}
}