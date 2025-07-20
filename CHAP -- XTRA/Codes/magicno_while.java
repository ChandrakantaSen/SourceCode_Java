import java.io.*;
class magicno_while
{
public static void main(String args[])throws IOException
{
int m,n,d,sum=0;
BufferedReader buf=new BufferedReader (new InputStreamReader(System.in));
System.out.println("enter the no. to find whether the number is a magic number or not:");
n=Integer.parseInt(buf.readLine());
m=n;
while(m>0)
{
 d=m%10;
sum=sum+d;
m=m/10;
}
if((sum==10)||(sum==1))
{
System.out.println("it is a magic number  ");
}
else
{
System.out.println("it is not a magic number");
}

}
}