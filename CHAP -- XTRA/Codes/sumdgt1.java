import java.io.*;
class sumdgt1   
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,m,d,s=0;
System.out.println("Enter the number to find the sum of its  digits ");
n=Integer.parseInt(br.readLine());
m=n;
do
{
d=m%10;
s=s+d;
m=m/10;
    }
    while(m>0);
    System.out.println("The sum of digits of the number"+n+"is"+s);
}
}