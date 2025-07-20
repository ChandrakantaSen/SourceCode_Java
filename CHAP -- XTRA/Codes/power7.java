 import java.io.*;
public class power7
{
public static void main(String args[])throws IOException
{
double a,b,c;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("enter two number to find the sum of those no. raised to the power 4"); 
a=Double.parseDouble(br.readLine());
b=Double.parseDouble(br.readLine());
c=Math.pow(a,4)+Math.pow(b,4);
System.out.println("the sum of" +a+"raised to the power 4 &"+b+" raised to the power 4 is"+c);
    }
}