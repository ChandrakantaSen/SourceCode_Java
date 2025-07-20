import java.io.*;
class reverse0   
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,m,d,s=0;
System.out.println("Enter the number to print the reverse of it ");
n=Integer.parseInt(br.readLine());
m=n;
do
{
d=m%10;
s=s*10+d;
m=m/10;
    }
    while(m>0);
System.out.println("The reverse of the number"+n+"is"+s);
}
}