import java.io.*;
public class greater_or_not
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double a,b;
System.out.println("enter the first number:-");
a=Double.parseDouble(br.readLine());
System.out.println("enter the second number:-");
b=Double.parseDouble(br.readLine());
if(a>b)
{
System.out.println(a+" is a greater number");
}
if(b>a)
{
System.out.println(b+" is a greater number");
}
}
}
