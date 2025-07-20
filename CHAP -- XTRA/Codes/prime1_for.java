import java.io.*;
class prime1_for
{
public static void main(String args[])throws IOException
{
int i,flag=0,n;
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number to check wheather it is prime or not :");
n=Integer.parseInt(buf.readLine());
for(i=1;i<=n/2;i++)
{
if(n%i==0)
{
flag++;
}
}
if(flag==1)
{
System.out.println(n+" is a prime number ");
}
else
{
System.out.println(n+" is not a prime number ");
}
}
}