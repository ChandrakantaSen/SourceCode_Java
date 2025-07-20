import java.io.*;
class ifor6
{
public static void main(String args[])throws IOException 
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
int a;
System.out.println("Enter a number :");
a=Integer.parseInt(buf.readLine());
if((a%15==0)||(a%17==0))
{
System.out.println("The number is divisible by  15 or 17");
}
else
{
System.out.println("The number is not divisible by  15 or 17");
}
}
}