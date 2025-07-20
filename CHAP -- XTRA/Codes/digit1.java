import java.io.*;
class digit1
{
public static void main(String args[])throws IOException
{
int n,m,d;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the no.: -");
n=Integer.parseInt(br.readLine());
m=n;
System.out.println("The extracted digit from "+n+" are as follows:-");
while(m>0)
{
d=m%10;
System.out.println(d);
m=m/10;
    }
}}
