import java.io.*;
class ifand4
{
public static void main(String args[])throws IOException 
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
int a;
System.out.println("Enter a number :");
a=Integer.parseInt(buf.readLine());
if((a%7==0)&&(a%8==0))
{
System.out.println("The number is divisible by both 7 and 8");
}
else
{
System.out.println("The number is not divisible by both 7 and 8");
}
}
}