import java.io.*;
class factors_while
{
public static void main(String args[])throws IOException
{
int i=1,n;
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number to find its factors :");
n=Integer.parseInt(buf.readLine());
while(i<=n)
{
if(n%i==0)
{
System.out.println("The factors are : "+i);
}
i++;
}
}
}