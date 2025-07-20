import java.io.*;
class reverse_dowhile
{
public static void main(String args[])throws IOException
{
int m,n,d,sum=0;
BufferedReader buf=new BufferedReader (new InputStreamReader(System.in));
System.out.println("enter the no. to find the reverse of that number:");
n=Integer.parseInt(buf.readLine());
m=n;
do
{
 d=m%10;
sum=(sum*10)+d;
m=m/10;
}
while(m>0);
System.out.println("the reverse of that number is = "+sum);
}
}