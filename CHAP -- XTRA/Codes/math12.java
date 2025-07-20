import java.io.*;
public class math12
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double a,b;
System.out.println("enter the number to find out the celling value:-");
a=Integer.parseInt(br.readLine());
b=Math.ceil(a);
System.out.println("The celling value of"+a+" is"+b);
}
}
