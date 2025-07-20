import java.io.*;
public class sqrt
{
public static void main(String args[])throws IOException
{
double a,b;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("enter a number to find its square root");
a=Double.parseDouble(br.readLine());
b=Math.sqrt(a);
System.out.println("the square root of" +a+"is"+b);
    }
}