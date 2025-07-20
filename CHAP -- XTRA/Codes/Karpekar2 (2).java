import java.io.*;
class Karpekar2
{
public static void main(String args[])throws IOException
{
int n,m,s,i;
int d=1;
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the range - :");
n=Integer.parseInt(buf.readLine());
for(i=1;i<=n;i++)
{
s=i*i;
m=i;
d=1;
while(m>0)
{
d=d*10;
m=m/10;
}
if(((s%d)+(s/d))==i)
{
System.out.println(i);
}
}
}
}