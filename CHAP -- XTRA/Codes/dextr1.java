import java.io.*;
class dextr1   
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,m,d,s=0;
System.out.println("Enter the number to extract each digit from it");
n=Integer.parseInt(br.readLine());
System.out.println("Each extracted digit of the number"+n+"are as follows:");
m=n;
do
{
d=m%10;
s=s*10+d;
m=m/10;
    }
    while(m>0);
    m=s;
   do
    {
        d=m%10;
        System.out.println(d);
        m=m/10;
    }
    while(m>0);
}
}