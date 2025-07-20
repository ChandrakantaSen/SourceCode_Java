import java.io.*;
public class power1
{
public static void main(String args[])throws IOException
{
double a,b,c;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("enter two number to find one no. raised to the power of the other ");
a=Double.parseDouble(br.readLine());
b=Double.parseDouble(br.readLine());
c=Math.pow(a,b);
System.out.println(+a+ "raised to the power"+b+"is"+c);
    }
}