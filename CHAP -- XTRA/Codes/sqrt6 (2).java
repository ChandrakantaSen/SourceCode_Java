import java.io.*;
class sqrt6
{
public static void main (String args[])throws IOException
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
double a,b,c;
System.out.println("Enter the first number:");
a=Double.parseDouble(buf.readLine());
System.out.println("Enter the second  number:");
b=Double.parseDouble(buf.readLine());
c=Math.sqrt(Math.pow((a-b),2));
System.out.println("The sqaure root of the square of the additional values of  "+a+" and "+b+"is="+c);
}
}