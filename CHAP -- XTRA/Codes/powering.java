import java.io.*;
public class powering
{
public static void main(String[]args)throws IOException
{
double a,b;
BufferedReader cld=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter thy number followed by value of power");
a=Double.parseDouble(cld.readLine());
b=Double.parseDouble(cld.readLine());
System.out.println("it is"+ Math.pow(a,b));
    }
}