import java.io.*;
class armstrongno
{
public static void main(String args[])throws IOException
{

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int d,n,dup,sum=0;
System.out.println("Enter a NO.:");
n = Integer.parseInt(br.readLine());
for(dup=n;n>0;n/=10)
{
d=n%10;
sum = sum + d*d*d;
}
if (sum==dup)
System.out.println(dup+ " is an armstrong no.");
else
System.out.println(dup+ " is not an armstrong no.");
}
}