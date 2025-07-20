import java.io.*;
class rev_fibo
{
void main()throws IOException
{
 BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
int i=1,a=0,b=1,c=0,s=0,n,s1=0;
System.out.println("Enter limit : ");
n=Integer.parseInt(buf.readLine());
while(a<=n)
{
if(a<=n)
{
s=b;
s1=a;
System.out.print(a+" ");
    }
c=a+b;
a=b;
b=c;
i++;
    }
    c=0;
System.out.println();
while(s1>0)
{
System.out.print(s1+" ");
c=s1;
s1=s-s1;
s=c;
}
System.out.print(s1+" ");

    }
}