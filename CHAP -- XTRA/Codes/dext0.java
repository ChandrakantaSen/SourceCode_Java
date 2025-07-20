import java.io.*;
class dext0   
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,m,d;
System.out.println("Enter the number to extract each digit from it");
n=Integer.parseInt(br.readLine());
System.out.println("Each extracted digit of the number"+n+"are as follows:");
for(m=n;m>0;m=m/10)
{
d=m%10;
System.out.println(d);
    }
}
}