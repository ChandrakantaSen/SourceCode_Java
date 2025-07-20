import java.io.*;
class prime_dowhile
{
public static void main(String args[])throws IOException
{
int i=1,count=0,n;
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number to check wheather it is prime or not :");
n=Integer.parseInt(buf.readLine());
do
{
if(n%i==0)
{
count++;
}
i++;
}
while(i<=n);
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