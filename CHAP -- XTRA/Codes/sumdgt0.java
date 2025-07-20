import java.io.*;
class sumdgt0   
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,m,d,s=0;
System.out.println("Enter the number to count the number of digits in it");
n=Integer.parseInt(br.readLine());
for(m=n;m>0;m=m/10)
{
d=m%10;
s=s+d;
    }
    System.out.println("The sum of digits of the number"+n+"is"+s);
}
}