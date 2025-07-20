import java.io.*;
class floor
{
public static void main(String args[])throws IOException
{
double a,b;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter a no. to print the floor value");
a=Double.parseDouble(br.readLine());
b=Math.floor(a);
System.out.println("The floor value of"+a+"is"+b);
    }
} 