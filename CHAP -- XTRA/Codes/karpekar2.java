import java.io.*;
class karpekar2
{
public static void main(String args[])throws IOException
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
int n,s=0,s1=0,d,d1,d2,s2=0,d3,s3=0;
System.out.println("Enter a number to check whether it is karpekar number or not : ");
n=Integer.parseInt(buf.readLine());
int copy=n;//10
int copy1=copy;//1
if(copy>9)//10>0
{
while(copy>0)//10>0
{
d=copy%10;//0,1
s=s+d;//1
copy=copy/10;//1,0
}
if(s>9)//
{
while(s>0)//
{
d1=s%10;//
s1=s1+d1;//
s=s/10;//
}
}
else
{
s1=s;//s1=1
}
}
else
{
s1=copy;//
}
int m=n*n;//100
while(m>0)//100>0
{
d2=m%10;//0,0,1
s2=s2+d2;//1
m=m/10;//1,0,0
}
if(s2>9)//
{
while(s2>0)//
{
d3=s2%10;//
s3=s3+d3;//
s2=s2/10;//
}
}
else
{
s3=s2;//
}
if(s1==s3)//
{
System.out.println(n+" is a karpekar number");
}
else
{
System.out.println(n+" is not a karpekar number");
}
}
}

