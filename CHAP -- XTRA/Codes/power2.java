import java.io.*;
public class power2
{
public static void main(String args[])throws IOException
{
double a,b,c;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("enter two number to find the square of its sum");
a=Double.parseDouble(br.readLine());
b=Double.parseDouble(br.readLine());
c=Math.pow((a+b),2);
System.out.println("the square of" +(a+b)+"is"+c);
    }
}