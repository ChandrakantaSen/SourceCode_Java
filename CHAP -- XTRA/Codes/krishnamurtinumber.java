import java .io.*;
class krishnamurtinumber
{
public static void main (String args[]) throws IOException
{
int n,m,d,s=0,fact,i;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter any no");
n=Integer.parseInt (br.readLine());
m=n;
while (m>0)
{
d=m%10;
fact=1;
for (i=1;i<=d;i++)
{
fact=fact*i;
    }
    s=s+fact;
    m=m/10;
}
if (s==n)
{
System.out.println (n+" The number is a Krishnamurti number ");
    }
    else 
    {
        System.out.println (n+" The number is not a Krishnamurti numhber ");
    }
}
    }