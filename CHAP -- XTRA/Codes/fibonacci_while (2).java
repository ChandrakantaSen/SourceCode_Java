import java.io.*;
class fibonacci_while
{
public static void main(String args[])throws IOException 
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
int a,b,c,n;
System.out.println("Enter the range : - ");
n=Integer.parseInt(buf.readLine());
a=0;
b=1;
while(a<=n)
{
System.out.println(a);
c=a+b;
b=a;
a=c;
}
}
}