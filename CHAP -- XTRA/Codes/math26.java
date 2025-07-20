import java.io.*;
public class math26
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double a,b,c;
System.out.println("enter the first number:-");
a=Double.parseDouble(br.readLine());
System.out.println("enter the second number:-");
b=Double.parseDouble(br.readLine());
c=Math.max(a,b);
System.out.println("The maximum value between "+a+" & "+b+" is"+c);
}
}
