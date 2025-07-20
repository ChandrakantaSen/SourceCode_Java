import java.io.*;
class ifor1
{
public static void main(String args[])throws IOException 
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
int a;
System.out.println("Enter a number :");
a=Integer.parseInt(buf.readLine());
if((a%5==0)||(a%2==0))
{
System.out.println("The number is divisible by  5 or 2");
}
else
{
System.out.println("The number is not divisible by  5 or 2");
}
}
}