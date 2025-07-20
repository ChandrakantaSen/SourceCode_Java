import java.io.*;
public class math17
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double a,b;
System.out.println("enter the number to find out the tan value:-");
a=Integer.parseInt(br.readLine());
b=Math.tan(a);
System.out.println("The tan value of"+a+" is"+b);
}
}
