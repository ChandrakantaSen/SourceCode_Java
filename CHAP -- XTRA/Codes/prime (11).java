import java.io.*;
class prime
{
public static void main(String args[])throws IOException
{
BufferedReader off=new BufferedReader(new InputStreamReader(System.in));
int i,n,c=0;
System.out.println("Enter any no.");
n=Integer.parseInt(off.readLine());
for(i=1;i<=n;i++)
{
if(n%i==0)
{
c++;
    }
}
if(c==2)
{
System.out.println(n+" is a prime no.");
    }
    else
    {
        System.out.println(n+" is not a prime no.");
    }
}
    }
    