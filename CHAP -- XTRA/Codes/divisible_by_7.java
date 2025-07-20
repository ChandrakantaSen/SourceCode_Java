import java.io.*;
public class divisible_by_7
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double a;
System.out.println("enter the first number:-");
a=Double.parseDouble(br.readLine());
if(a%7==0)
{
System.out.println(a+ "is divisible by 7");
}
else
{
System.out.println(a+ "is not is divisible by 7");
}
}
}
