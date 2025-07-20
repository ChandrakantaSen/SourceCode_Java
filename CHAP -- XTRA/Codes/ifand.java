import java.io.*;
class ifand
{
public static void main(String args[])throws IOException 
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
int a;
System.out.println("Enter a number :");
a=Integer.parseInt(buf.readLine());
if((a%2==0)&&(a%4==0))
{
System.out.println("The number id divisible by both 2 and 4");
}
else
{
System.out.println("The number is not divisible by both 2 and 4");
}
}
}