import java.io.*;
class prime_pelindrome
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,n,d,m,s=0,count=0;
System.out.println("Enter a number:- ");
n=Integer.parseInt(br.readLine());
for(i=1;i<=n;i++)
{
if(n%i==0)
{
count++;
    }
}
if(count==2)
{
m=n;
while(m>0)
{
d=m%10;
s=s*10+d;                      
m=m/10;
    }
if(n==s)
{
System.out.println("The number "+n+" is a prime palindrome number.");
    }
    else
    {
    System.out.println("The number "+n+" is a prime but not palindrome number.");
}
}
    }
}
