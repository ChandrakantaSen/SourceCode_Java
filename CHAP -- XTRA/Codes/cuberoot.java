import java.io.*;
class cuberoot
{
public static void main(String args[])throws IOException
{
double a,b;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter a no. to print the cube root value");
a=Double.parseDouble(br.readLine());
b=Math.cbrt(a);
System.out.println("The cube root value of"+a+"is"+b);
    }
}