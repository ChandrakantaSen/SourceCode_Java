import java.math.*;
import java.io.*;
class sqrt2
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double a,b;
System.out.println("Enter the First number : - ");
a=Double.parseDouble(br.readLine());
b=Math.sqrt(a);
System.out.println("The square root of "+a+" is = "+b);
}
}