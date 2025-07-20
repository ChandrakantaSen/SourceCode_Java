import java.io.*;
class neon0   
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,m,d,s=0;
System.out.println("Enter the number to check whether it is neon or not ");
n=Integer.parseInt(br.readLine());
m=n*n;
do
{
d=m%10;
s=s+d;
m=m/10;
    }
    while(m>0);
    if(s==n)
    {
    System.out.println(n+"is a neon number");
}
else
{
 System.out.println(n+"is not a neon number");
}
}
}