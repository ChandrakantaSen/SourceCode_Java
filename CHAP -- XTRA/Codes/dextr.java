import java.io.*;
class dextr   
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,m,d,s=0;
System.out.println("Enter the number to extract each digit from it");
n=Integer.parseInt(br.readLine());
System.out.println("Each extracted digit of the number"+n+"are as follows:");
m=n;
while(m>0)
{
d=m%10;
s=s*10+d;
m=m/10;
    }
    m=s;
    while(m>0)
    {
        d=m%10;
        System.out.println(d);
        m=m/10;
    }
}
}