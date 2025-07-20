import java.io.*;
public class math1
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double a,b,c;
System.out.println("enter the first number:-");
a=Double.parseDouble(br.readLine());
System.out.println("enter the second number:-");
b=Double.parseDouble(br.readLine());
c=Math.sqrt(a+b);
System.out.println("The square root values of(a+b)is:-"+c);
}
}
