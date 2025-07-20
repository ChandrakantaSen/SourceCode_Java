import java.io.*;
class reverse
{
public static void main(String args[])throws IOException
{
int n,m,d,s=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any no. : - ");
n=Integer.parseInt(br.readLine());
m=n;
while(m>0)
{
d=m%10;
s=s*10+d;
m=m/10;
    }
    System.out.println("The revsrse of "+n+" is : -"+s);
}
    }