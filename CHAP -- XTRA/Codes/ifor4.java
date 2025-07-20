import java.io.*;
class ifor4
{
public static void main(String args[])throws IOException 
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
int a;
System.out.println("Enter a number :");
a=Integer.parseInt(buf.readLine());
if((a%7==0)||(a%8==0))
{
System.out.println("The number is divisible by  7 or 8");
}
else
{
System.out.println("The number is not divisible by  7 or 8");
}
}
}