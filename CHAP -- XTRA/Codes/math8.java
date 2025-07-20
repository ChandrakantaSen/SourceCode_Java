import java.io.*;
public class math8

{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double a,b;
System.out.println("enter the number to find out the cube root:-");
a=Integer.parseInt(br.readLine());
b=Math.cbrt(a);
System.out.println("The cube root of "+a+" is"+b);
}
}
