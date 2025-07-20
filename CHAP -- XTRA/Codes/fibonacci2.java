import java.io.*;
class fibonacci2
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a,b,c,n,i;
System.out.println("Enter the range");
n=Integer.parseInt(br.readLine());
a=0;
b=1;
c=0;
for(i=1;i<=n;i++)
{
System.out.println(a);
c=a+b;
b=a;
a=c;
    }
}
    }