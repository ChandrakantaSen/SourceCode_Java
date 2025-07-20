
import java.io.*;
class smithrange
{
public static void main(String args[])throws IOException
{
int n,m,d,s=0,i,j,c=0,s1=0,p,k,s3;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the range to find out the smith numbers upto that range : - ");
n=Integer.parseInt(br.readLine());
System.out.println("The smith numbers upto "+n+" are as follows : -  ");
for(p=1;p<=n;p++)
{
s=0;
s1=0;
c=0;
m=p;
s3=0;
while(m>0)
{
d=m%10;
s=s+d;
m=m/10;
}
d=0;
k=p;
for(i=1;i<=k;i++)
{
c=0;
if(k%i==0)
{
for(j=1;j<=i;j++)
{
if(i%j==0)
{
c++;
}
}
if(c==2)
{
m=i;
s1=0;
while(m>0)
{
d=m%10;
s1=s1+d;
m=m/10;
}
s3=s3+s1;
k=k/i;
i=1;
}
}
}
if(s==s3)
{
System.out.println(p);
}
}
}
}
