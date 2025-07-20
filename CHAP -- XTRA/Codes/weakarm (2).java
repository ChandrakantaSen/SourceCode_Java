import java.io.*;
class weakarm
{
public static void main(String args[])throws IOException
{
BufferedReader buf=new BufferedReader (new InputStreamReader(System.in));
int s=0,p,n,m,d,i=0;
double s1=0;
System.out.println("enter a number");
 n=Integer.parseInt(buf.readLine());
p=n;
while(p>0)
{
d=p%10;
s=s*10+d;
p=p/10;
}
while(s>0)
{
i++;
int d2=s%10;
 s1=s1+(Math.pow(d2,i));
s=s/10;
}
if(s1==n)
{
System.out.println(n+" is a weakarm number");
}
else
{
System.out.println(n+"is not a weakarm number");
}
}
}