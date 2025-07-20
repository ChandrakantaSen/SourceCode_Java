import java.io.*;
class fibonacci_sum
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,i,a,b,c,m,d,s;
System.out.println("Enter the range : - ");
n=Integer.parseInt(br.readLine());
System.out.println("The sum of each fibonacci series number are as follows : - ");
a=0;
b=1;
c=0;
for(i=1;i<=n;i++)
{
s=0;
m=a;
while(m>0)
{
d=m%10;
s=s+d;
m=m/10;
}
System.out.println(s);
c=a+b;
b=a;
a=c;
}
    }
}