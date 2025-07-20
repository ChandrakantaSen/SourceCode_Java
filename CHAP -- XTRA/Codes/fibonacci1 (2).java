import java.io.*;
class fibonacci1
{
public static void main(String args[])throws IOException
{
int a,b,c,n;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the number upto the the fibonacci series will so on: - ");
n=Integer.parseInt(br.readLine());
a=0;
b=1;
c=0;
System.out.println("The fibonacci upto "+n+" aae as follows: - ");
while(c<=n)
{
System.out.println(a);
c=a+b;
b=a;
a=c;
    }
}}