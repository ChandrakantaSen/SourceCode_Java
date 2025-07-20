import java.io.*;
class sumdgt   
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,m,d,s=0;
System.out.println("Enter the number to find the sum of its  digits ");
n=Integer.parseInt(br.readLine());
m=n;
while(m>0)
{
d=m%10;
s=s+d;
m=m/10;
    }
    System.out.println("The sum of digits of the number"+n+"is"+s);
}
}