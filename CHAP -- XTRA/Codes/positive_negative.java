import java.io.*;
public class positive_negative
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double a;
System.out.println("enter the first number:-");
a=Double.parseDouble(br.readLine());
if(a>0)
{
System.out.println(a+ "is the positive number");
}
else
{
System.out.println(a+ "is the negative number");
}
}
}
