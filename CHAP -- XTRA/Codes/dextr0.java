import java.io.*;
class dextr0   
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,m,d,s=0;
System.out.println("Enter the number to extract each digit from it");
n=Integer.parseInt(br.readLine());
System.out.println("Each extracted digit of the number"+n+"are as follows:");
for(m=n;m>0;m=m/10)
{
d=m%10;
s=s*10+d;
    }
    for(m=s;m>0;m=m/10)
    {
        d=m%10;
        System.out.println(d);
    }
}
}