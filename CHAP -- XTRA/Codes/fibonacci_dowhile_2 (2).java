import java.io.*;
class fibonacci_dowhile_2
{
public static void main(String args[])throws IOException 
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
int i=1,a,b,c,n;
System.out.println("Enter the range : - ");
n=Integer.parseInt(buf.readLine());
a=0;
b=1;
do
{
System.out.println(a);
c=a+b;
b=a;
a=c;
i++;
}
while(i<=n);
}
}