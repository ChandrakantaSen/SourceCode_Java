import java.io.*;
class if4
{
public static void main(String args[])throws IOException
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
int a;
System.out.println("Enter the number :");
a=Integer.parseInt(buf.readLine());
if (a%3==0)
{
System.out.println("The number is divisible by 3");
}
else
{
System.out.println("The number is not divisible by 3");
}
}
}
