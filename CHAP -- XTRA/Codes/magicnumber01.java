import java .io.*;
class magicnumber01
{
public static void main (String args[]) throws IOException
{
int n,m,d,s=0;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter any no");
n=Integer.parseInt (br.readLine());
m=n;
while (m>9)
{
s=0;
while (m>0)
{
d=m%10;
s=s+d;
m=m/10;
    }
    if (s>9)
    {
        m=s;
    }
}
if (s==1)
{
System.out.println (" The number is a Magic number ");
    }
    else
    {
        System.out.println (" The number is not a Magic number ");
    }
}
    }