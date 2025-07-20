import java.io.*;
class amicable_dwhile
{
public static void main(String args[])throws IOException
{
int i=1,n,m,s=0,s1=0;
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the number to find whether it is amicable or not:");
n=Integer.parseInt(buf.readLine());
System.out.println("enter the number to find whether it is amicable or not:");
m=Integer.parseInt(buf.readLine());
do
{
if(n%i==0)
{
s=s+i;
}
}
while(i<n);
do
{
if(m%i==0)
{
s1=s1+i;
}
i++;
}
while(i<m);
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