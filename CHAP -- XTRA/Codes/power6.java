 import java.io.*;
public class power6
{
public static void main(String args[])throws IOException
{
double a,b,c;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter two number to find the difference of its cube");
a=Double.parseDouble(br.readLine());
b=Double.parseDouble(br.readLine());
c=Math.pow(a,3)-Math.pow(b,3);
System.out.println("The difference of the cube of" +a+"&"+b+"is"+c);
    }
}