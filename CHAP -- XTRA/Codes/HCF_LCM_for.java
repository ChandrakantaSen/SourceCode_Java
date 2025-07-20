import java.io.*;
class HCF_LCM_for
{
public static void main(String args[])throws IOException
{
int m,n,hcf=0,i,lcm;
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the number :");
n=Integer.parseInt(buf.readLine());
System.out.println("enter the other	 number :");
m=Integer.parseInt(buf.readLine());
if(m>n)
{
for(i=1;i<=m;i++)
{
if((m%i==0)&&(n%i==0))
{
hcf=i;
}
}
}
else
{

for(i=1;i<=n;i++)
{
if((n%i==0)&&(m%i==0))
{
hcf=i;
}
}
}
lcm=(m*n)/hcf;
System.out.println("H.C.F = "+hcf);
System.out.println("L.C.M = "+lcm);
}
}
