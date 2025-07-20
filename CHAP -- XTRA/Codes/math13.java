import java.io.*;
public class math13
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double a,b;
System.out.println("enter the number to find out the exponential value:-");
a=Integer.parseInt(br.readLine());
b=Math.exp(a);
System.out.println("The exponant value of"+a+" is"+b);
}
}
