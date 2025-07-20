 import java.io.*;
public class power4
{
public static void main(String args[])throws IOException
{
double a,b,c;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("enter two number to find the difference of its square");
a=Double.parseDouble(br.readLine());
b=Double.parseDouble(br.readLine());
c=Math.pow(a,2)-Math.pow(b,2);
System.out.println("the difference of the square of" +a+"&"+b+"is"+c);
    }
}