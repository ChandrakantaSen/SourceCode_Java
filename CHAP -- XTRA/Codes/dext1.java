import java.io.*;
class dext1   
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,m,d;
System.out.println("Enter the number to extract each digit from it");
n=Integer.parseInt(br.readLine());
System.out.println("Each extracted digit of the number"+n+"are as follows:");
m=n;
do
{
d=m%10;
System.out.println(d);
m=m/10;
    }
    while(m>0);
}
}