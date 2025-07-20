import java.io.*;
class ceil
{
public static void main(String args[])throws IOException
{
double a,b;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter a no. to print the ceil value");
a=Double.parseDouble(br.readLine());
b=Math.ceil(a);
System.out.println("The ceil  value of"+a+"is"+b);
    }
}