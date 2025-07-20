import java.io.*;
class armstrong_dowhile
{
public static void main(String args[])throws IOException
{
int m,n,sum=0;
BufferedReader buf=new BufferedReader (new InputStreamReader(System.in));
System.out.println("enter the no. to check whether the number is an armstrong no. or not:");
n=Integer.parseInt(buf.readLine());
m=n;
do
{
int d=m%10;
sum=sum+(d*d*d);
m=m/10;
}
while(m>0);
if(sum==n)
{
System.out.println(n+" is an armstrong no.");
}
else
{
System.out.println(n+"is not an armstrong number");
}
}
}