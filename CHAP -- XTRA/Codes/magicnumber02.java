import java .io.*;
class magicnumber02
{
public static void main (String args[]) throws IOException
{
int n,m,d,s=0;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter any no");
n=Integer.parseInt (br.readLine());
m=n;
do
{ 
s=0;
do
{
d=m%10;
s=s+d;
m=m/10;
    }
    while (m>0); 
    if (s>9)
    {
        m=s;
}
    }
while (m>9);
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
