import java.io.*;
public class math21
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double a,b;
System.out.println("enter the number to find out the asin value:-");
a=Integer.parseInt(br.readLine());
b=Math.asin(a);
System.out.println("The asin value of"+a+" is"+b);
}
}
