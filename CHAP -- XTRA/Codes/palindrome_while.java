import java.io.*;
class palindrome_while
{
public static void main(String args[])throws IOException
{
int m,n,d,sum=0;
BufferedReader buf=new BufferedReader (new InputStreamReader(System.in));
System.out.println("enter the no. to check whether it is a palindnome number or not :");
n=Integer.parseInt(buf.readLine());
m=n;
while(m>0)
{
 d=m%10;
sum=(sum*10)+d;
m=m/10;
}
if(sum==n)
{
System.out.println("it is a palindnome number");
}
else
{
System.out.println("it is not a palindnome number");
}
}
}


