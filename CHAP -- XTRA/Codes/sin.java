import java.io.*;
class sin
{
public static void main(String args[])throws IOException
{
double a,b;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter a no. to print the sin value");
a=Double.parseDouble(br.readLine());
b=Math.sin(a);
System.out.println("The sin value of"+a+"is"+b);
    }
}