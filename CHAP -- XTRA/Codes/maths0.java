import java.io.*;
class maths0
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double a,b;
System.out.println("enter the number to find out the square root0:-");
a=Double.parseDouble(br.readLine());
b=Math.sqrt(a);
System.out.println("The square root values of "+a+" is=:-"+b);
}
}
