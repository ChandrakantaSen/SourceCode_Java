import java.io.*;
class tan
{
public static void main(String args[])throws IOException
{
double a,b;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter a no. to print the tan value");
a=Double.parseDouble(br.readLine());
b=Math.tan(a);
System.out.println("The tan value of"+a+"is"+b);
    }
}