import java.io.*;
class pn
{
public static void main(String args[])throws IOException
{
BufferedReader off=new BufferedReader(new InputStreamReader(System.in));
int i,n,c=0;
System.out.println("Enter any no.");
n=Integer.parseInt(off.readLine());
i=1;
do
{
if(n%i==0)
{
c++;
    }
     i++;
}
while(i<=n);
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
    