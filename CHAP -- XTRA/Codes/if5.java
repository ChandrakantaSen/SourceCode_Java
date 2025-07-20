import java.io.*;
class if5
{
public static void main(String args[])throws IOException
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
int a;
System.out.println("Enter the number :");
a=Integer.parseInt(buf.readLine());
if (a%5==0)
{
System.out.println("The number is divisible by 5");
}
else
{
System.out.println("The number is not divisible by 5");
}
}
}
