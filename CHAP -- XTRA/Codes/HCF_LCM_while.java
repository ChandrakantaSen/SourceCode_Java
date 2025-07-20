import java.io.*;
class HCF_LCM_while
{
public static void main(String args[])throws IOException
{
int m,n,hcf=0,i=1,lcm;
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the number :");
n=Integer.parseInt(buf.readLine());
System.out.println("enter the other	 number :");
m=Integer.parseInt(buf.readLine());
if(m>n)
{
while(i<=m)
{
if((m%i==0)&&(n%i==0))
{
hcf=i;
}
i++;
}

}
else
{

while(i<=n)
{
if((n%i==0)&&(m%i==0))
{
hcf=i;
}
i++;
}
}
lcm=(m*n)/hcf;
System.out.println("H.C.F = "+hcf);
System.out.println("L.C.M = "+lcm);
}
}
