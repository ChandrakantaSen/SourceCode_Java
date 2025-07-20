import java.io.*;
class prime_while
{
public static void main(String args[])throws IOException
{
int i=1,count=0,n;
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number to check wheather it is prime or not :");
n=Integer.parseInt(buf.readLine());
while(i<=n)
{
if(n%i==0)
{
count++;
}
i++;
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