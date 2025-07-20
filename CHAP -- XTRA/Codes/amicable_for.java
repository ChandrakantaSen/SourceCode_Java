import java.io.*;
class amicable_for
{
public static void main(String args[])throws IOException
{
int i,n,m,s=0,s1=0;
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the number to find whether it is amicable or not:");
n=Integer.parseInt(buf.readLine());
System.out.println("enter the number to find whether it is amicable or not:");
m=Integer.parseInt(buf.readLine());
for(i=1;i<n;i++)
{
if(n%i==0)
{
s=s+i;
}
}
for(i=1;i<m;i++)
{
if(m%i==0)
{
s1=s1+i;
}
}
if((s1==n)&&(s==m))
{
System.out.println("the number are amicable to each other");
}
else
{
System.out.println("the numbers are not amicable to each other");
}
}
}