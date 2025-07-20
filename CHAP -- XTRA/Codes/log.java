import java.io.*;
class log
{
public static void main(String args[])throws IOException
{
double a,b;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter a no. to print the logarithm value");
a=Double.parseDouble(br.readLine()); 
b=Math.log(a);
System.out.println("The logarithm value of"+a+"is"+b);
    }
}