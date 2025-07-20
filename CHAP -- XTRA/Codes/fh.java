import java.io.*;
class fh
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,b,i;
double d=1.0;
System.out.println("Enter the number");
b=Integer.parseInt(br.readLine());
System.out.println("Enter the range");
n=Integer.parseInt(br.readLine());
for(i=1;i<=n;i++)
{
d=d+Math.pow(b,i);
}
System.out.println("the result is"+d);
    }
}
