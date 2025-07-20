import java.io.*;
class krishnamurti
{
public static void main(String args[])throws IOException
{
int m,n,fact,i,d,s=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the no. : -");
n=Integer.parseInt(br.readLine());
m=n;
while(m>0)
{
d=m%10;
fact=1;
for(i=1;i<=d;i++)
{
fact=fact*i;
    }
    s=s+fact;
    m=m/10;
}
if(s==n)
{
System.out.println("It is a krishnamurti no.");
    }
    else
    {
System.out.println("It is not a krishnamurti no.");
    }
}
    }
    
    