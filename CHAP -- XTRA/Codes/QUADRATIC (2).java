import java.io.*;
class QUADRATIC/*SRIDHAR ACHARYA*/
{
public static void main (String args[])throws IOException
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
double a,b,c,d,x;
System.out.println("a =");
a=Integer.parseInt(buf.readLine());
System.out.println("b =");
b=Integer.parseInt(buf.readLine());
System.out.println("c =");
c=Integer.parseInt(buf.readLine());
d=(Math.sqrt((Math.pow(b,2))-(4*a*c)));
x=(-b-d)/(2*a);
System.out.println("The answer is ="+x);
}
}
