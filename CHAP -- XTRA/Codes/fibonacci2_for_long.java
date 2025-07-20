import java.io.*;
class fibonacci2_for_long
{
public static void main(String args[])throws IOException 
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
long a,b,c,n,i;
System.out.println("Enter the range : - ");
n=Long.parseLong(buf.readLine());
a=0;
b=1;
for(i=1;i<=n;i++)
{
System.out.println(a);
c=a+b;
b=a;
a=c;
}
}
}