import java.io.*;
class ifand2
{
public static void main(String args[])throws IOException 
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
int a;
System.out.println("Enter a number :");
a=Integer.parseInt(buf.readLine());
if((a%5==0)&&(a%10==0))
{
System.out.println("The number is divisible by both 5 and 10");
}
else
{
System.out.println("The number is not divisible by both 5 and 10");
}
}
}