import java.io.*;
class smith
{
public static void main(String args[])throws IOException
{
int s=0,bg=0,d,s1=0,s2,s3=0,d2;

BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter a number to check whether it is a smith number or not:");
int num=Integer.parseInt(buf.readLine());
int copy=num;
int copy1=copy;
for(int i=1;i<num;i++)
{
if(num%i==0)
{
if(i>=10)
{
 bg=i;
}
else
{
s=s+i;
}
}
while(bg>0)
{
d=bg%10;
s1=s1+d;
bg=bg/10;
}
}
s2=s+s1;
for(int j=1;j<=copy;j++)
{
d2=copy%10;
s3=s3+d2;
copy=copy/10;
}
if(s3==s2)
{
System.out.println(copy1+" is a smith no: ");
}
else
{
System.out.println(copy1+" is not a smith number");
}
}
}