 import java.io.*;
public class power5
{
public static void main(String args[])throws IOException
{
double a,b,c;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("enter two number to find the sum of its cube");
a=Double.parseDouble(br.readLine());
b=Double.parseDouble(br.readLine());
c=Math.pow(a,3)+Math.pow(b,3);
System.out.println("the sum of the cube of" +a+"&"+b+"is"+c);
    }
}