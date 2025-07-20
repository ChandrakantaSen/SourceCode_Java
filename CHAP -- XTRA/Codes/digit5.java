import java.io.*;
class digit5
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
s=s+d;
m=m/10;
    }
    System.out.println("The sum of the digit of number "+n+" is : -"+s);
}
    }