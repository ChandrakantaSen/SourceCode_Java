import java.io.*;
class sqrt1
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