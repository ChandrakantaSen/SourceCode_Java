import java.io.*;
class pelindrome_prime
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,n,d,m,s=0,count=0;
System.out.println("Enter a number:- ");
n=Integer.parseInt(br.readLine());
m=n;
while(m>0)
{
d=m%10;
s=s*10+d;                      
m=m/10;
    }
if(n==s)
{
for(i=1;i<=n;i++)
{
if(n%i==0)
{
count++;
    }
}
if(count==2)
{

System.out.println("The number "+n+" is a prime palindrome number.");
    }
    else
    {
    System.out.println("The number "+n+" is a palindrome but not prime number.");
}
}
}
}
