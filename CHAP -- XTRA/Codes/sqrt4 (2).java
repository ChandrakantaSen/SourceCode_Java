import java.io.*;
class sqrt4
{
public static void main (String args[])throws IOException
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
double a,b,c;
System.out.println("Enter the first number:");
a=Double.parseDouble(buf.readLine());
System.out.println("Enter the second  number:");
b=Double.parseDouble(buf.readLine());
c=Math.sqrt((Math.pow(a,2))+(Math.pow(b,2)));
System.out.println("The square root of the additional values of the squares "+a+" and "+b+"is="+c);
}
}