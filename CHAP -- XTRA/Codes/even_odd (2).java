import java.io.*;
public class even_odd
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double a;
System.out.println("enter the first number:-");
a=Double.parseDouble(br.readLine());
if(a%2==0)
{
System.out.println(a+ "is an even number");
}
else
{
System.out.println(a+ "is an odd number");
}
}
}
