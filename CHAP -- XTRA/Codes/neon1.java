import java.io.*;
class neon1   
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,m,d,s=0;
System.out.println("Enter the number to check whether it is neon or not ");
n=Integer.parseInt(br.readLine());
for(m=n*n;m>0;m=m/10)
{
d=m%10;
s=s+d;
    }
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