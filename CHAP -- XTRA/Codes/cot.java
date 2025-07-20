import java.io.*;
class cot
{
public static void main(String args[])throws IOException
{
double a,b;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter a no. to print the cot value");
a=Double.parseDouble(br.readLine());
b=1/Math.tan(a);
System.out.println("The cot value of"+a+"is"+b);
    }
}