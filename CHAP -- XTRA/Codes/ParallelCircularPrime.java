import java.io.*;
class ParallelCircularPrime
{
public static void main(String args[])throws IOException
{
int n,m,d,c=0,c1=0,count,flag=0,i,j,s=0,b=0;
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number to find whether it is ParallelCircularPrime or not:");
n=Integer.parseInt(buf.readLine());
m=n;
for(j=1;j<=m;j++)
{
if(m%j==0)
{
c1++;
}
}
if(c1==2)
{
while(m>0)
{
d=m%10;
c++;
count=0;
for(i=1;i<=d;i++)
{
if(d%i==0)
{
count++;
}
}
if(count==2)
{
flag++;
}
m=m/10;
}
if(flag==c)
{
m=n;
while(m>0)
{
d=m%10;
s=s*10+d;
m=m/10;
}
for(j=1;j<=s;j++)
{
if(s%j==0)
{
b++;
}
}
}
}
if(b==2)
{
System.out.println(n+" is a parellel circular prime number .");
}
else
{
System.out.println(n+" is not a parellel circular prime number .");
}
}
}
