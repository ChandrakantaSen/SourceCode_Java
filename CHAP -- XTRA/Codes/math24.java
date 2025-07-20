import java.io.*;
public class math24
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double a,b;
System.out.println("enter the number to find out the absolute value:-");
a=Integer.parseInt(br.readLine());
b=Math.abs(a);
System.out.println("The absolute value of"+a+" is"+b);
}
}
