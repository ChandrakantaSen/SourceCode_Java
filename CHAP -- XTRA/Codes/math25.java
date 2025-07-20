import java.io.*;
public class math25
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double a,b;
System.out.println("enter the number to find out the logarithm value:-");
a=Integer.parseInt(br.readLine());
b=Math.log(a);
System.out.println("The logarithm value of"+a+" is"+b);
}
}
