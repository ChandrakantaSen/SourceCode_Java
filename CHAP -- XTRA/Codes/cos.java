import java.io.*;
class cos
{
public static void main(String args[])throws IOException
{
double a,b;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter a no. to print the cos value");
a=Double.parseDouble(br.readLine());
b=Math.cos(a);
System.out.println("The cos value of"+a+"is"+b);
    }
}