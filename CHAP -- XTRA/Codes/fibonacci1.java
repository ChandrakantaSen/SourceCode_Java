import java.io.*;
class fibonacci1  
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a,b,c,n;
System.out.println("Enter the range");
n=Integer.parseInt(br.readLine());
a=0;
b=1;
c=0;
while(c<=n)
{
System.out.println(a);
c=a+b;
b=a;
a=c;
    }
}
    }