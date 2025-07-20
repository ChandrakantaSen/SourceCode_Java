import java.io.*;
public class multiply_double
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double a,b,c;
System.out.println("enter the first number:-");
a=Double.parseDouble(br.readLine());
System.out.println("enter the second number:-");
b=Double.parseDouble(br.readLine());
c=a*b;
System.out.println("the multiplied value of "+a+" and "+b+"is :-"+c);
}
}















