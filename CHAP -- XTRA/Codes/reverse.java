import java.io.*;
class reverse   
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,m,d,s=0;
System.out.println("Enter the number to print the reverse of it ");
n=Integer.parseInt(br.readLine());
m=n;
while(m>0)
{
d=m%10;
s=s*10+d;
m=m/10;
    }
System.out.println("The reverse of the number"+n+"is"+s);
}
}