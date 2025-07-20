import java.io.*;
class prime_dowl
{
public static void main(String args[])throws IOException
{
 int n,i,c=0;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the number to check whether it is prime or not");
n=Integer.parseInt(br.readLine());
i=1;
do
{
if(n%i==0)
{
c++;
}
i++;
}
while(i<=n);
if(c==2)
{
System.out.println(n+"is a prime number");
}
else
{
System.out.println(n+"is not a prime number");
}
}
}

