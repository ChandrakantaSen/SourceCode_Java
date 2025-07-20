import java.io.*;
class sec
{
public static void main(String args[])throws IOException
{
double a,b;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter a no. to print the sec value");
a=Double.parseDouble(br.readLine());
b=1/Math.cos(a);
System.out.println("The sec value of"+a+"is"+b);
    }
}