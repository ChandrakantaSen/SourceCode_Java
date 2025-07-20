import java.io.*;
class tribonacci  
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a,b,c,n,d;
System.out.println("Enter the range");
n=Integer.parseInt(br.readLine());
a=0;
b=0;
c=1;
d=0;
while(d<=n)
{
System.out.println(a);
d=a+b+c;
c=b;
b=a;
a=d;
    }
}
    }