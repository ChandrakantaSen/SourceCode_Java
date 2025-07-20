import java.io.*;
class krishnamurti
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,m,d,s=0,i,fact;
System.out.println("Enter the number to check wheather the number is Krishnamurti number or not : -");
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
System.out.println("Krishnamurti no.");
    }
    else
    {
        System.out.println(" Not Krishnamurti no.");
    }
}
    }