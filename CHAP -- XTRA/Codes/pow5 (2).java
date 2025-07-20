import java.io.*;
class pow5
{
public static void main (String args[])throws IOException
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
double a,b,c;
System.out.println("Enter the first number:");
a=Double.parseDouble(buf.readLine());
System.out.println("Enter the second  number:");
b=Double.parseDouble(buf.readLine());
c=Math.pow((a-b),2);
System.out.println("The squares of the subtractional value "+a+" and "+b+"is="+c);
}
}