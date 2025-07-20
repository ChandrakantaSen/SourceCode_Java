import java.io.*;
class neon_no1
{
public static void main(String args[])throws IOException
{
int n,m,d,s=0;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter any no.:-");
n=Integer.parseInt(br.readLine());
m=n*n;
while(m>0)
{
d=m%10;
s=s+d;
m=m/10;
    }
    if(s==n)
    {
        System.out.println(n+" is a neon no.");
    }
    else
    {
        System.out.println(n+" is not a neon no.");
    }
}
    }
