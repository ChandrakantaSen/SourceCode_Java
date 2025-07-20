import java.io.*;
class prime_for
{
public static void main(String args[])throws IOException
{
int i,count=0,n;
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number to check wheather it is prime or not :");
n=Integer.parseInt(buf.readLine());
for(i=1;i<=n;i++)
{
if(n%i==0)
{
count++;
}
}
if(count==2)
{
System.out.println(n+" is a prime number ");
}
else
{
System.out.println(n+" is not a prime number ");
}
}
}