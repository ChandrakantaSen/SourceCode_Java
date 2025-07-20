import java.io.*;
public class power0
{
public static void main(String args[])
{
try
{
double a,b;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("enter a number to find its square");
a=Double.parseDouble(br.readLine());
b=Math.pow(a,2);
System.out.println("the square of" +a+"is"+b);
    }
    catch(Exception e)
    {
        System.out.println("Wrong Input");
    }
}
}