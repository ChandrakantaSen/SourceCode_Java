import java.io.*;
class twin
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the number");
int n=Integer.parseInt(br.readLine());
int i,j,d=0,r=0;
int c=n,c1=0,c2=0;
while(c>0)
{
d=c%10;
r=r*10+d;
c=c/10;
}
for(i=1;i<=n;i++)
{
if(n%i==0)
{
c1=c1+1;
}
}
if(c1==2)
{
System.out.println("the original number is prime"+n);
for(i=1;i<=r;i++)
{
if(r%i==0)
{
c2=c2+1;
}
}
if(c2==2)
{
System.out.println("the second number is prime"+r);
}
}
else
{
System.out.println("the number is not prime");
System.exit(0);
}
}
}