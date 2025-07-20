import java.io.*;
class cosec
{
public static void main(String args[])throws IOException
{
double a,b;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter a no. to print the cosec value");
a=Double.parseDouble(br.readLine());
b=1/Math.sin(a);
System.out.println("The cosec value of"+a+"is"+b);
    }
}