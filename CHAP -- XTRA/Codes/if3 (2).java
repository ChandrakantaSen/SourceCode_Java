import java.io.*;
class if3
{
public static void main(String args[])throws IOException
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
int a;
System.out.println("Enter the number :");
a=Integer.parseInt(buf.readLine());
if (a%2==0)
{
System.out.println("The number is divisible by 2");
}
else
{
System.out.println("The number is not divisible by 2");
}
}
}
